package Sorting;

public class InsertionSort {
    public static void main(String[] args) {

        int[] array=new int[]{3,51,12,45,24,55,2};
        for(int i=0;i<array.length;i++){
            int j=i;
            while(j>0&&array[j-1]>array[j]){
               int tmp=array[j-1];
               array[j-1]=array[j];
               array[j]=tmp;
               j--;
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
