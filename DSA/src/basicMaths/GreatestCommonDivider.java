package basicMaths;

public class GreatestCommonDivider {
    //4 and 8 are the numbers where
     // 4 can be divided by 1 ,2 and 4
    // 8 can be divided by 1,2,4, and 8
    // 4 is the common divider that divides both the number so basically GCD is 4.

    //below solution is brute force approach.
    public static void main(String[] args) {
        int num1=68;
        int num2=125;
        //find the minimum of both numbers
        int minNumber=num1>num2?num1:num2;
        int greatestCommonDivider=1;
        while(minNumber!=0){
            if(num1%minNumber==0 && num2%minNumber==0){
              greatestCommonDivider=minNumber;
                break;
            }
            minNumber--;
        }
        System.out.println("greatest common divider:"+greatestCommonDivider);
        //anyway always greatest common divider remains one
    }
}
