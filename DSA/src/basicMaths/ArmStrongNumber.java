package basicMaths;


import java.util.Scanner;

//Armstrong number is a number that is equal to the sum of cubes of its digits. For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
//
//        Let's try to understand why 153 is an Armstrong number.
//
//        153 = (1*1*1)+(5*5*5)+(3*3*3)
//        where:
//        (1*1*1)=1
//        (5*5*5)=125
//        (3*3*3)=27
//        So:
//        1+125+27=153
public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number= input.nextInt();
        int originalNumber=number;
        int totalCubeSumofEachDigit=0;
        while(number!=0){
            int rem=number%10;
            int cube= (int) Math.pow((double)rem,(double) 3);
            totalCubeSumofEachDigit+=cube;
            number/=10;
        }
        boolean isArmStrongNumber=originalNumber==totalCubeSumofEachDigit?true:false;
        System.out.println("given input is armStrong number:"+ isArmStrongNumber);

    }
}
