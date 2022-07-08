import java.util.Scanner;

public class Var5 {

	public static void main (String [] args) {
		//시작
		Scanner sc = new Scanner(System.in);
		
		//입력 받은 수를 저장할 변수
		int num = 0;
		
		//합계를 저장할 변수
		int total = 0;
		
		System.out.println("첫번째 숫자를 입력해 주세요");
		num = sc.nextInt();//3
		System.out.println(num);
		total += num;
		//total = total + num;
		System.out.println(total);
		
		System.out.println("두번째 숫자를 입력해 주세요");
		num = sc.nextInt();//5
		total += num;
		//total = total + num;
		
		System.out.println("세번째 숫자를 입력해 주세요");
		num = sc.nextInt();
		total += num;
		//total = total + num;
		
		System.out.println("네번째 숫자를 입력해 주세요");
		num = sc.nextInt();
		total += num;
		//total = total + num;
		
		
		System.out.println("다섯번째 숫자를 입력해 주세요");
		num = sc.nextInt();
		total += num;
		//total = total + num;
		
		
		System.out.println("총 합은?");
		System.out.println(total);
		
		
		
		
		//끝 
	}
	
}
