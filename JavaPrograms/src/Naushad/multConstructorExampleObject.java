package Naushad;

public class multConstructorExampleObject {

	public static void main(String[] args) {
		multConstructorExampleMethod obj1=new multConstructorExampleMethod();
		multConstructorExampleMethod obj2=new multConstructorExampleMethod(13);
		multConstructorExampleMethod obj3=new multConstructorExampleMethod(13,57);
		multConstructorExampleMethod obj4=new multConstructorExampleMethod(13,57,20);

		System.out.printf("%s\n",obj1.toMilitary());
		System.out.printf("%s\n",obj2.toMilitary());
		System.out.printf("%s\n",obj3.toMilitary());
		System.out.printf("%s\n",obj4.toMilitary());
	}

}
