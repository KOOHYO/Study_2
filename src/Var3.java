import java.util.Scanner;

public class Var3 {
	
	public static void main(String [] args){
		System.out.println("Start");
		//키보드와 연결
		Scanner sc = new Scanner(System.in);
		
		int gion=0;
		double cheon = 0.0;
		String name="";//null을 쓰기도 함
		
		//sysout Crtl+space
		System.out.println("현재 온도를 입력하세요");
		gion = sc.nextInt();
		
		System.out.println("현재 체온을 입력하세요");
		cheon = sc.nextDouble(); //nextchar는 없다!
		
		System.out.println("이름을 입력하세요");
		name = sc.next(); //nextfine()
		
		
		System.out.print("현재 온도는");
		System.out.println(gion);
		
		System.out.print("현재 체온은");
		System.out.println(cheon);

		System.out.print("너의 이름은");
		System.out.println(name);
		
		
		System.out.println("Finish");
		
	}

}
