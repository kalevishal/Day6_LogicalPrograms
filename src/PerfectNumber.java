import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int sum=0;
		System.out.println("Enter your number");
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		for (int i = 1; i < num; i++) {
			if (num%i == 0) {
				sum=sum+i;
			}
		}
		if (sum == num) {
			System.out.println("It is an perfect number");
		}
		else
			System.out.println("It is not a perfect number");
	}

}