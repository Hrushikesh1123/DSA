package arrays;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");
       // Scanner sc=new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        int maximum_number=-1;
        for(int i=0;i<numbers.length;i++){
            maximum_number=numbers[i]>maximum_number?numbers[i]:maximum_number;
        }
        System.out.println("maximum number is:"+maximum_number);
    }
}
