public class SelectionSort {
    //Running time complexity
    //Two loops so O(n^2)
    //Inplace sorting algorithm
    static int[] selectionsort(int[] array){
        int n= array.length;
        int imin= 0;
        for(int i=0;i<n-1;i++){
            imin=i;
            for(int j=i+1;j<n;j++){
                if(array[j]< array[imin]){
                    imin=j;
                }
            }
            int temp= array[i];
            array[i]= array[imin];
            array[imin]= temp;
        }

        return array;




    }

    public static void main(String[] args){
        int arr[]= {2,7,4,1,5,3};
        arr= selectionsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
