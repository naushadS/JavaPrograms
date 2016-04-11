package Naushad;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.spec.KeySpec;
import java.util.Scanner;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class AESFileDecryption {
	public static void main(String[] args) throws Exception {

		Scanner input=new Scanner(System.in);

		System.out.println("Enter the name of the file (to be received & decrypted):");
		String filename=input.nextLine();
		
		File gf=new File(filename+"_encrypted.des");
		if(gf.exists()){
		
		System.out.println("Enter the password to decrypt the file with:");
		String password=input.nextLine();
		input.close();

		// reading the salt
		// user should have secure mechanism to transfer the
		// salt, iv and password to the recipient
		FileInputStream saltFis = new FileInputStream("salt.enc");
		byte[] salt = new byte[8];
		saltFis.read(salt);
		saltFis.close();

		// reading the iv
		FileInputStream ivFis = new FileInputStream("iv.enc");
		byte[] iv = new byte[16];
		ivFis.read(iv);
		ivFis.close();

		SecretKeyFactory factory = SecretKeyFactory
				.getInstance("PBKDF2WithHmacSHA1");
		KeySpec keySpec = new PBEKeySpec(password.toCharArray(), salt, 65536,
				128);
		SecretKey tmp = factory.generateSecret(keySpec);
		SecretKey secret = new SecretKeySpec(tmp.getEncoded(), "AES");

		// file decryption
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		cipher.init(Cipher.DECRYPT_MODE, secret, new IvParameterSpec(iv));
		
		FileInputStream fis = new FileInputStream(filename+"_encrypted.des");
		FileOutputStream fos = new FileOutputStream(filename+"_decrypted.txt");
		byte[] in = new byte[64];
		int read;
		while ((read = fis.read(in)) != -1) {
			byte[] output = cipher.update(in, 0, read);
			if (output != null)
				fos.write(output);
		}
try{
		byte[] output = cipher.doFinal();
		if (output != null)
			fos.write(output);
		fis.close();
		fos.flush();
		fos.close();
		System.out.println("File Decrypted.");
		
		//display the file content
		FileInputStream decryptedfilecontent=new FileInputStream(filename+"_decrypted.txt");
		byte[] bytes=new byte[decryptedfilecontent.available()];
		decryptedfilecontent.read(bytes);
		for(byte b:bytes){
			char chars=(char)b;
			System.out.print(chars);
		}
		decryptedfilecontent.close();
}catch(BadPaddingException ex){
	System.out.println("password/key is incorrect");
}
	}else{
		System.out.println("File not found");
	}
}
}