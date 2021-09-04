package firstday1;

public class Fibonacci {

	public static void main(String[] args) {
		int range=8;
		int firstNum=0;
		int secNum=1;
		int sum;
		System.out.print(firstNum +" "+ secNum);	
		for(int i=2; i<range; i++) {
			sum = firstNum+secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.print(" "+sum);
		}
	}

}
