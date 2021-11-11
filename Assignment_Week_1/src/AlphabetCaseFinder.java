import java.util.Scanner;

public class AlphabetCaseFinder {
    public static void main(String[] args) {
        Scanner cObj = new Scanner(System.in);
        System.out.println("Please enter the character");
        char c = cObj.next().charAt(0);

        //System.out.println(c);

        Boolean value = Character.isUpperCase(c);
        if(value == true){
            System.out.println("UPPERCASE");
        }
        else if(value == false){
            System.out.println("LOWERCASE");
        }

    }
}

