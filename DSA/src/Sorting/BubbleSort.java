package Sorting;

public class BubbleSort {
    //bubbleSort

    public static void main(String[] args) {
        int[] unSortedArr=new int[]{4,2,4,1,7};
        for(int i=0;i<unSortedArr.length-1;i++){
            for(int j=0;j<unSortedArr.length-2;j++){
                if(unSortedArr[j]>unSortedArr[j+1]){
                    int temp=unSortedArr[j+1];
                    unSortedArr[j+1]=unSortedArr[j];
                    unSortedArr[j]=temp;
                }
            }
        }
        for(int i=0;i<unSortedArr.length;i++) {
            System.out.println(unSortedArr[i]);
        }
    }
}
