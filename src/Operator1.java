
public class Operator1 {

	public static void main(String []args) {
		
		int count=0;
		
		count = count+1; //1
		count = count+1; //2
		
		count = 0;
		
		++count; //선행 count+1 먼저 증감시키고 프린트를 해라
		count++; //후행 count+1 프린트하고 나중에 증감시켜라
		
		System.out.println(++count); //3
		System.out.println(count++); //3 3을 프린트 후
		System.out.println(count); //다시 카운트를 출력하니 하나 증감됌
		
		count = 0;
		
		int result = --count;
		System.out.println(count); //1
		System.out.println(result); //1
		
		result = count--;
		System.out.println(count); //2 연산자 먼저
		System.out.println(result); //1
		
		result = result-4;
		
		result-=4;
		
		
		
	}
	
}
