
public class Var8 {

	public static void main(String [] args) {
		System.out.println("Start");
		
		//암호화 연산식
		// 0   ->   0
		// 1   ->   1
		// 2   ->   2
		// 3   ->   3
		// 4   ->   10
		// 5   ->   11
		// 6   ->   12
		// 7   ->   13
		// 8   ->   20
		// 9   ->   21
		// 10  ->   22
		
		int input=12;
		
		int output=input/4*10+input%4;
		//int output=input+input%6

		System.out.println("Input : "+input);
		System.out.println("Output : "+output);
		
		
		System.out.println("Finish");
		
	}
	
}
