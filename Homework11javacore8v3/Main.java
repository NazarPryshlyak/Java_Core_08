package Homework11javacore8v3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	 Scanner scanner = new Scanner(System.in);
	 
	 int a;
	 int b;
	 
	 System.out.println("Введіть перше ціле число:");
	 
	  if (scanner.hasNextInt()) {
		  a = scanner.nextInt();
		  
      System.out.println("Введіть друге ціле число:");
      
      if (scanner.hasNextInt()) {
		  b = scanner.nextInt();
		  
	  scanner.close();  
	  
	  System.out.println("Сума введених чисел рівна " + (a + b));
	  }
	
      else
    	  System.out.println("Помилка! Потрібно ввести ціле число");
	  }

      else
    	  System.out.println("Помилка! Потрібно ввести ціле число");
	  }	  
}
