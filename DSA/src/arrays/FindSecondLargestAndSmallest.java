package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindSecondLargestAndSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        List<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < length; i++) {
            Scanner input = new Scanner(System.in);
            array.add(input.nextInt());
        }
        int min1 = 30484954;
        int min2 = min1;
        int max1 = -min1;
        int max2 = max1;
        for (int i = 0; i < length; i++) {
            if (min1 > array.get(i)) {
                min1 = array.get(i);
            }
            if (max1 < array.get(i)) {
                max1 = array.get(i);
            }
        }
        for (int i = 0; i < length; i++) {
            if (min1 < array.get(i) && min2 > array.get(i)) {
                min2 = array.get(i);
            }
            if (max1 > array.get(i) && max2 < array.get(i)) {
                max2 = array.get(i);
            }
        }


        System.out.println("min and max are " + min2);
        System.out.println("min and max are " + max2);
    }

}

