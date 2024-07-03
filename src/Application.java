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
                        case "pow":
                            double base = Double.parseDouble(args[i + 1]);
                            double exponent = Double.parseDouble(args[i + 2]);
                            System.out.println("Result for " + base + " ^ " + exponent + " = " + power(base, exponent));
                            i++; // Move to the next operation
                            break;
                        case "sqrt":
                            double numSqrt = Double.parseDouble(args[i + 1]);
                            System.out.println("Result for sqrt(" + numSqrt + ") = " + sqrt(numSqrt));
                            break;
                        case "log":
                            double numLog = Double.parseDouble(args[i + 1]);
                            System.out.println("Result for log(" + numLog + ") = " + log(numLog));
                            break;
                        case "log10":
                            double numLog10 = Double.parseDouble(args[i + 1]);
                            System.out.println("Result for log10(" + numLog10 + ") = " + log10(numLog10));
                            break;
                        case "sin":
                            double angleSin = Math.toRadians(Double.parseDouble(args[i + 1]));
                            System.out.println("Result for sin(" + angleSin + ") = " + sin(angleSin));
                            break;
                        case "cos":
                            double angleCos = Math.toRadians(Double.parseDouble(args[i + 1]));
                            System.out.println("Result for cos(" + angleCos + ") = " + cos(angleCos));
                            break;
                        case "tan":
                            double angleTan = Math.toRadians(Double.parseDouble(args[i + 1]));
                            System.out.println("Result for tan(" + angleTan + ") = " + tan(angleTan));
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
        	while (true) {
				System.out.println("Enter operation (add, subtract, multiply, divide, pow, sqrt, log, log10, sin, cos, tan, factorial) or 'exit' to quit:");
				String operation = scanner.next();
				switch (operation.toLowerCase()) {
				    case "add": // goes to add function
				        System.out.println("Enter the first operand:");
				        double num1 = scanner.nextDouble();
				        System.out.println("Enter the second operand:");
				        double num2 = scanner.nextDouble();
				        System.out.println("Result: " + add(num1, num2));
				        break;
				    case "factorial": // goes to factorial function
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
				    case "pow": // goes to Exponent function
				        System.out.println("Enter the first operand:");
				        num1 = scanner.nextDouble();
				        System.out.println("Enter the second operand:");
				        num2 = scanner.nextDouble();
				        System.out.println("Result: " + power(num1, num2));
				        break;
				    case "sqrt": // goes to Square Root function
				        System.out.println("Enter a number:");
				        num1 = scanner.nextDouble();
				        System.out.println("Result: " + sqrt(num1));
				        break;
				    case "log": // goes to natural logarithm function
				        System.out.println("Enter a number:");
				        num1 = scanner.nextDouble();
				        System.out.println("Result: " + log(num1));
				        break;
				    case "log10": // goes to Base-10 logarithm function
				        System.out.println("Enter a number:");
				        num1 = scanner.nextDouble();
				        System.out.println("Result: " + log10(num1));
				        break;
				    case "sin": // goes to sine function
				        System.out.println("Enter a number:");
				        num1 = scanner.nextDouble();
				        System.out.println("Result: " + sin(num1));
				        break;
				    case "cos": // goes to cosine function
				        System.out.println("Enter a number:");
				        num1 = scanner.nextDouble();
				        System.out.println("Result: " + cos(num1));
				        break;
				    case "tan": // goes to tangent function
				        System.out.println("Enter a number:");
				        num1 = scanner.nextDouble();
				        System.out.println("Result: " + tan(num1));
				        break;
				    case "exit":
                        System.out.println("Exiting calculator...");
                        scanner.close();
                        return; 
				}
        	}
        }
		
	} // operation functions
    // Add
	public static double add(double a, double b) {
		return a+b;
	}
	// Subtract
	public static double subtract(double a, double b) {
		return a-b;
	}
	// Multiply
	public static double multiply(double a, double b) {
		return a*b;
	}
	// Divide
	public static double divide(double a, double b) {
		return a/b;
	}
	// Factorial
	public static double factorial(double n) {
		if (n<=1) {
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}
	// Exponentiation
	public static double power(double base, double exponent) {
	    return Math.pow(base, exponent);
	}

	// Square root
	public static double sqrt(double number) {
	    return Math.sqrt(number);
	}

	// Natural logarithm
	public static double log(double number) {
	    return Math.log(number);
	}

	// Base-10 logarithm
	public static double log10(double number) {
	    return Math.log10(number);
	}

	// Sine function
	public static double sin(double angleRadians) {
	    return Math.sin(angleRadians);
	}

	// Cosine function
	public static double cos(double angleRadians) {
	    return Math.cos(angleRadians);
	}

	// Tangent function
	public static double tan(double angleRadians) {
	    return Math.tan(angleRadians);
	}
}




