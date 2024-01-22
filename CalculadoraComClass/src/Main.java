import java.util.Scanner;

public class Main {
	
	//MAIN
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Calculadora calculate = new Calculadora();
		
		System.out.println("*** SIMPLE CALCULATOR ***");

			System.out.print("\nEnter the value: ");
				double value1 = input.nextInt();

			System.out.print("Insert an operation, type = (+,-,*, or /): ");
				char operation = input.next().charAt(0);

			System.out.print("Enter other value: ");
				double value2 = input.nextInt();

				double result = calculate.Calculate(value1, operation, value2);

			System.out.println("Result of the operation is: " + result);
		
		input.close();
		

	}
}
