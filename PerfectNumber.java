package bridgelabz.com;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		int number, result = 0;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter number : ");
			number = scanner.nextInt();
		}
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				result = result + i;
			}
		}
		if (number == result) {
			System.out.println("The given number is perfect number");
		} else {
			System.out.println("The given number is not perfect number");
		}

	}
}
