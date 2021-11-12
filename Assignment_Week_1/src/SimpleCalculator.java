import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        char signOfOperation ;
        int number1 , number2 ;

        Scanner sObj = new Scanner(System.in);
        System.out.println("Enter the operation you want to perform : ");
        signOfOperation = sObj.next().charAt(0);

        System.out.println("Enter first number");
        number1 = sObj.nextInt();

        System.out.println("Enter second number");
        number2 = sObj.nextInt();

        switch (signOfOperation) {
            case '+' : System.out.println("The sum is " + ( number1 + number2)); break;
            case '-' : System.out.println("The difference is " + ( number1 - number2)); break;
            case '*' : System.out.println("The product is " + ( number1 * number2)); break;
            case '/' : System.out.println("The quotient is " + ( number1 / number2)); break;

            default: System.out.println("INVALID SIGN");
        }
    }
}
