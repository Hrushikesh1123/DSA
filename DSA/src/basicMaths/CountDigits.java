package basicMaths;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        //need to print how many digits are present in the number
        int totalDigits=0;
        while(number>0){
            totalDigits++;
            number/=10;
        }
        System.out.println("Total digits present in this number are :"+ totalDigits);

    }
}
