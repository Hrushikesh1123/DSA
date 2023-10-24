package basicMaths;

public class CheckPalindrome {
    public static void main(String[] args) {
        int x=121;
        int reversedNumber=ReverseNumber.reverse(x);
        boolean isPalindrome=reversedNumber==x?true:false;
        System.out.print(isPalindrome);
        //it can be done in two way by reversing the integer is one way.
        //one more is by using the two pointers techninque if the input is String.
    }
}
