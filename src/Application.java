import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        if (args.length > 0) {
            // Process CLI arguments
            for (int i = 0; i < args.length; i += 2) {
                String operation = args[i].toLowerCase();
                try {
                    switch (operation) {
                        case "add":
                            double num1 = Double.parseDouble(args[i + 1]);
                            double num2 = Double.parseDouble(args[i + 2]);
                            System.out.println("Result for "+num1+" + "+num2+" = "+add(num1, num2));
                            i++; // Move to the next operation
                            break;
                        case "subtract":
                            num1 = Double.parseDouble(args[i + 1]);
                            num2 = Double.parseDouble(args[i + 2]);
                            System.out.println("Result for "+num1+" - "+num2+" = "+subtract(num1, num2));
                            i++; // Move to the next operation
                            break;
                        case "multiply":
                            num1 = Double.parseDouble(args[i + 1]);
                            num2 = Double.parseDouble(args[i + 2]);
                            System.out.println("Result for "+num1+" * "+num2+" = "+ multiply(num1, num2));
                            i++; // Move to the next operation
                            break;
                        case "divide":
                            num1 = Double.parseDouble(args[i + 1]);
                            num2 = Double.parseDouble(args[i + 2]);
                            if (num2 == 0) {
                                System.out.println("Error: Division by zero");
                            } else {
                                System.out.println("Result for "+num1+" / "+num2+" = "+ divide(num1, num2));
                            }
                            i++; // Move to the next operation
                            break;
                        case "factorial":
                            num1 = Double.parseDouble(args[i + 1]);
                            System.out.println("Result for "+num1+"! "+"is: "+ factorial(num1));
                            break;
                        default:
                            System.out.println("Unknown operation: " + operation);
                            break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number format for " + operation + " operation");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Not enough arguments for " + operation + " operation");
                }
            }
        } else {
			// no CLI arguments
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter operation (e.g., add, subtract, multiply, divide, factorial):");
			String operation = scanner.next();
			// further
			switch (operation.toLowerCase()) {
			    case "add":
			        System.out.println("Enter the first operand:");
			        double num1 = scanner.nextDouble();
			        System.out.println("Enter the second operand:");
			        double num2 = scanner.nextDouble();
			        System.out.println("Result: " + add(num1, num2));
			        break;
			    case "factorial":
			        System.out.println("Enter a number:");
			        double number = scanner.nextDouble();
			        System.out.println("Result: " + factorial(number));
			        break;
			    case "subtract": // goes to subtract function
			        System.out.println("Enter the first operand:");
			        num1 = scanner.nextDouble();
			        System.out.println("Enter the second operand:");
			        num2 = scanner.nextDouble();
			        System.out.println("Result: " + subtract(num1, num2));
			        break;
			    case "multiply": // goes to multiply function
			        System.out.println("Enter the first operand:");
			        num1 = scanner.nextDouble();
			        System.out.println("Enter the second operand:");
			        num2 = scanner.nextDouble();
			        System.out.println("Result: " + multiply(num1, num2));
			        break;
			    case "divide": // goes to divide function
                    System.out.println("Enter the first operand:");
                    num1 = scanner.nextDouble();
                    System.out.println("Enter the second operand:");
                    num2 = scanner.nextDouble();
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero");
                    } else {
                        System.out.println("Result: " + divide(num1, num2));
                    }
                    break;
			   	}
			}
		
	} // operation functions
	public static double add(double a, double b) {
		return a+b;
		//a + b
	}
	
	public static double subtract(double a, double b) {
		return a-b;
		//a - b
	}
	
	public static double multiply(double a, double b) {
		return a*b;
		//a x b
	}
	
	public static double divide(double a, double b) {
		return a/b;
		// a / b
	}

	public static double factorial(double n) {
		if (n<=1) {
			return 1;
		} else {
			return n * factorial(n-1);
		} // factorial function 
	}
}




