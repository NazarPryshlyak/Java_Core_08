package Homework11javacore8v2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Введіть ціле число:");
		
		
		
		if (scanner.hasNextInt()) {
			if (scanner.nextInt() % 2 == 0 ) {
				System.out.println( " Число є парне ");
			} else
				System.out.println( " Число є непарне ");
		   } else {
			   System.out.println( " Потрібно ввести ціле число ! ");
		   }
		scanner.close();
	}
}
