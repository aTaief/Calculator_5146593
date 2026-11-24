
public class Calculator { 
  
    public int add(int a, int b) { 
        return a + b; 
    } 
  
    public int subtract(int a, int b) { 
        return a - b; 
    } 
  
    public int multiply(int a, int b) { 
        return a * b; 
    } 
  
    public double divide(int a, int b) { 
        if (b == 0) { 
            throw new ArithmeticException("Cannot divide by zero"); 
        } 
        return (double) a / b; 
    } 

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("add(2, 3)       = " + calc.add(2, 3));
        System.out.println("subtract(10, 4) = " + calc.subtract(10, 4));
        System.out.println("multiply(4, 5)  = " + calc.multiply(4, 5));
        System.out.println("divide(10, 4)   = " + calc.divide(10, 4));
    }
} 