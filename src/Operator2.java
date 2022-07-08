import java.util.Scanner;

public class Operator2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("나이를 입력 하세요");
		//1. 나이를 입력받아서 10대 유무를 판별
		int age=sc.nextInt();
		System.out.println( age > 19 ? "성년" : "미성년");
		
		
		System.out.println("물건의 가격을 입력하세요");
		//2. 물건의 가격이 30000 이상이면 배송료가 무료 아니면
		//   아니면 배송료가 가격의 10%로 책정
		//   최종 지불비용을 출력 하세요
		double price=sc.nextInt();
		double cart = price < 30000 ? 0 : price*0.1; 
		
		price = price+cart;	
		System.out.println(price < 30000 ? "무료" : "가격의 10%의 배송료가 붙습니다");
		System.out.print("최종지불액은 : ");
		System.out.println(price);
		
		

	}

}
