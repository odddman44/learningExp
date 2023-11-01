package javaJungseok.ch04;

public class Exercisse4_4 {

	public static void main(String[] args) {
		int sum = 0; // 총합을 저장할 변수
		int s = 1; // 값의 부호를 바꿔주는데 사용할 변수
		int num = 0;
		
		for(int i = 1; true; i++, s=-s) { // 매 반복마다 s의 값은 1,-1,1,-1...
			num = s * i; // i와 부호(s)를 곱해서 더할 값을 구한다.
			sum += num;
			
			if(sum>=100) // 총합이 100보다 같거나 크면 반복문을 빠져나간다.
				break;
		}
		
		System.out.println("num="+num);
		System.out.println("sum="+sum);
	}

}
