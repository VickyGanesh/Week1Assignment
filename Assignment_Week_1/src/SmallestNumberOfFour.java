import java.util.Scanner;

public class SmallestNumberOfFour {

    public static void main(String[] args) {

        int numList[] = new int[4];

        Scanner sObj = new Scanner(System.in);
        System.out.println("Enter the four numbers");

        for(int i=0;i<4;i++){
            numList[i] = sObj.nextInt();
        }
       /* for(int i=0;i<4;i++){
            System.out.println(numList[i]);
        }*/

        int minValue = numList[0];
        int i = 1;
        while(i<4){
            if(numList[i] < minValue )
            {
                minValue = numList[i];

            }  i++;

        }
        System.out.println("The smallest number is " + minValue);




    }
}
