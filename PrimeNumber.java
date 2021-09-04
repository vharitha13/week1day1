package firstday1;

public class PrimeNumber {

	public static void main(String[] args) {
		int a1 = 15;
		boolean flag = false;
		for (int i = 2; i <= (a1 / 2); i++) {
			int a2 = a1 % 2;
			if (a2 == 0) {
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println(a1 + "Is a Prime number");
		} else {
			System.out.println(a1 + "Is not a Prime number");
		}
	}

}
