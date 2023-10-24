package basicMaths;

public class ReverseNumber {
    //reverse a number contraint -2**31 to 2**31
    public int reverse(int x) {
        if(x==0)return 0;
        int reversedString=0;
        boolean isPositive=x>0?true:false;
        x=x>=0?x:(-1*x);
        //x=Math.abs(x);
        while(x>0){
            reversedString*=10;

            int digit=x%10;
            x/=10;
            reversedString+=digit;
        }
        return isPositive==true?reversedString:-(reversedString);
    }
}
