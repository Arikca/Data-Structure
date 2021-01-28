public class InsertionSort {
    //time complexity:
    //worst case and average case: O(n^2)
    //best case: O(n)
    //inplace sorting

    public static void insertionSort(int[] arr){
        int n= arr.length;
        int value=0;
        int hole=0;
        for(int i=1;i<n;i++){
           value= arr[i];
           hole=i;
           while(hole>0 && (arr[hole-1]> value)){
               arr[hole]= arr[hole-1];
               hole= hole-1;
           }
           arr[hole] = value;
        }
    }

    public static void main(String[] args){
        int[] arr= {4,3,5,1,9};
        insertionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
