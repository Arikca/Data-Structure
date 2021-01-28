public class MergeSort {
    //Analysis of merge sort
    //1. Divide & conquer
    //2. Uses Recursive
    //3. Stable sorting algorithm
    //4.Not an inplace sorting algorithm: space complexity: O(n)
    //Time complexity: O(nlogn)


    public static void merge(int[] left, int[] right, int[] arr){
        int nl= left.length;
        int rl= right.length;
        int i=0;
        int j=0;
        int k=0;
        while(i< nl && j<rl){
            if(left[i]<= right[j]){
                arr[k] = left[i];
                k= k+1;
                i= i+1;
            }
            else{
                arr[k] = right[i];
                k= k+1;
                j= j+1;
            }
        }
        while(i< nl){
            arr[k]= left[i];
            i= i+1;
            k= k+1;
        }
        while(j< rl){
            arr[k]= right[k];
            k=k+1;
            j++;
        }
    }

    public static void mergeSort(int[] arr){
        int n= arr.length;
        if(n<2) return;//base condition
        int mid= n/2;
        int[] left= new int[mid];
        int[] right= new int[n-mid];
        for(int i=0;i<mid;i++){
            left[i]= arr[i];
        }
        for(int i=mid;i<n;i++){
            right[i-mid]= arr[i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(left, right, arr);

    }
    public static void min(String[] args){
        int[] arr= {3,2,5,8,1,4};
        mergeSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
