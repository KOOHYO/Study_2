import java.util.Scanner;

public class Var10 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1=97;
		long num2=10L;
		char ch ='a';
		String name1="iu";
		String name2="iu";
		System.out.println("이름을 입력하세요");
		String name3=sc.next();//iu
		
		System.out.println(num1 == num2);
		System.out.println(ch==num1);
		System.out.println(name1==name2);
		System.out.println(name1==name3);
		
		int age = 20;
		boolean check = age >= 10 && age < 20;
		System.out.println(check);
		
		
		
	}

}
