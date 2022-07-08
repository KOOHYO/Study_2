import java.util.Scanner;

public class Var4 {
	
	public static void main(String [] args) {
		System.out.println("Start");
		Scanner scanner = new Scanner(System.in);
		
		String id ="";
		String pw ="";
		String xx ="";
		String name ="";
		int a =0;
		int g =0;
		int e =0;
		
		System.out.println("아이디를 입력해 주세요");
		id = scanner.next();
		
		System.out.println("비밀번호를 입력해 주세요");
		pw = scanner.next();
		
		System.out.println("성별을 입력해 주세요");
		xx = scanner.next();
		
		System.out.println("이름을 입력해 주세요");
		name = scanner.next();
		
		System.out.println("생년월일을 입력해 주세요");
		a = scanner.nextInt();
		g = scanner.nextInt();
		e = scanner.nextInt();
		
		System.out.println("아이디는");
		System.out.println(id);
		
		System.out.println("비밀번호는");
		System.out.println(pw);
		
		System.out.println("이름은");
		System.out.println(name);
		
		System.out.println("성별은");
		System.out.println(xx);
		
		System.out.println("생년월일은");
		System.out.print(a); System.out.print("년");
		System.out.print(g); System.out.print("월");
		System.out.print(e); System.out.println("일");
		
		
		
		System.out.println("Finish");
		
	}

}
