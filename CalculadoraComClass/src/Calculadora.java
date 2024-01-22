
public class Calculadora {

	//CLASS CALCULATOR
	private double sum (double v1, double v2) {
		return v1 + v2;
		
	} 
	private double subtraction (double v1, double v2) {
		return v1 - v2;
		
	} 
	private double multiplication (double v1, double v2) {
		return v1 * v2;
		
	} 
	private double division (double v1, double v2) {
		return  v1 / v2;
	}
	
	//Method open
	 public double Calculate(double value1, char operation, double value2) {
		switch(operation) {
		
		case '+':
			return sum(value1, value2);
			
		case '-':
			return subtraction(value1, value2);
			
		case '*':
			return multiplication(value1, value2);
			
		case '/':
			return division(value1, value2);
			
		default:
			return 0;
			
		}
	}
}



