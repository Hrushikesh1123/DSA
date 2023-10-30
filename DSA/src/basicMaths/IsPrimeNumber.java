package basicMaths;

import java.util.Scanner;

//Problem Statement: Given a number, check whether it is prime or not. A prime number is a natural number that is only divisible by 1 and by itself.
//        Examples 1 2 3 5 7 11 13 17 19 …
public class IsPrimeNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Integer n= input.nextInt();
        //brute force: run a loop from the 2 to n-1 check reminder whether its coming as 0 then its prime number 
        //optimal sqrt of n is the answer
        for(int divider=2;divider<Math.sqrt(n);divider++){
            if(n%divider==0){
                System.out.println("it is not a prime number");return;
            }
        }
        System.out.println("it is prime number");
    }
}
