package Homework11javacore8v2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ ���� �����:");
		
		
		
		if (scanner.hasNextInt()) {
			if (scanner.nextInt() % 2 == 0 ) {
				System.out.println( " ����� � ����� ");
			} else
				System.out.println( " ����� � ������� ");
		   } else {
			   System.out.println( " ������� ������ ���� ����� ! ");
		   }
		scanner.close();
	}
}
