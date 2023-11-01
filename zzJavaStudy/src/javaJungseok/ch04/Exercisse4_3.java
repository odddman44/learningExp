package javaJungseok.ch04;

public class Exercisse4_3 {

	public static void main(String[] args) {
		int sum = 0; // 총합 저장
		int totalSum = 0;
		
		for(int i=1; i <=10; i++) {
			sum += i;
			totalSum += sum;
		}
		
		
		System.out.println("totalSum="+totalSum);
	}

}
