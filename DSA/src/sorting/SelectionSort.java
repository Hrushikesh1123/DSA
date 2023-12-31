package sorting;

public class SelectionSort {
    //selection sorting
    //    Approach
//    1.in each iteration find the smallest element wiith the help of inner loop swap with the current position of the i.
    public static void main(String[] args) {
        int[] unSortedArr=new int[]{4,2,4,1,7};
        for(int i=0;i<unSortedArr.length;i++){
            int minIndex=-1;
            for(int j=i;j<unSortedArr.length-1;j++){
                if(unSortedArr[j]<unSortedArr[i]){
                    minIndex=j;
                }
            }
            if(minIndex!=-1){
                int temp=unSortedArr[minIndex];
                unSortedArr[minIndex]=unSortedArr[i];
                unSortedArr[i]=temp;
            }
        }
        for(int i=0;i<unSortedArr.length;i++){
            System.out.println(unSortedArr[i]);
        }
    }
}
