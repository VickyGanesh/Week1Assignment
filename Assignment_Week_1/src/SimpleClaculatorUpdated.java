import java.util.Scanner;

public class SimpleClaculatorUpdated {
    char signOfOperation;
    int numberOne ,numberTwo;
    void enterDetails(){
        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter the operation you want to perform : ");
        this.signOfOperation = sObj.next().charAt(0);

        System.out.println("Enter first number");
        this.numberOne = sObj.nextInt();

        System.out.println("Enter second number");
        this.numberTwo = sObj.nextInt();



    }

     void simpleCalculator(){
         switch (signOfOperation) {
             case '+' : System.out.println("The sum is " + ( this.numberOne + this.numberTwo)); break;
             case '-' : System.out.println("The difference is " + ( this.numberOne - this.numberTwo)); break;
             case '*' : System.out.println("The product is " + ( this.numberOne * this.numberTwo)); break;
             case '/' : System.out.println("The quotient is " + ( this.numberOne / this.numberTwo)); break;

             default: System.out.println("INVALID SIGN");
         }


    }
    public static void main(String[] args) {
        SimpleClaculatorUpdated sCalc = new SimpleClaculatorUpdated();
        int i = 0;
        while(i<1) {
            sCalc.enterDetails();
            sCalc.simpleCalculator();
            )
        }
    }

}
