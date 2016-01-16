package Naushad;

public class compositionExampleObject1 {

	public static void main(String[] args) {
    compositionMethod cm1=new compositionMethod(6, 3, 1995);
    compositionExampleObject2 ceo1=new compositionExampleObject2("naushad", cm1);
    
    System.out.println(ceo1);

	}

}
