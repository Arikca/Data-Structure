import java.util.Arrays;

public class DigitRearrangment {

  // Digit rearrangement method to find next greater number with same sets of digits
    //Algorithm:
    //1. we start from the right end because thats where numerical count starts from
    //2. we traverse the array is right to left direction to search for the digit numerically smaller than the rightmost digit
    //3. we swap the rightmost digit and the min digit
    //4. we swap the array in ascending order starting from the index next to minimum index to the last digit
    public static void swap(int[] arr, int i, int j){
        int k= arr[i];
        arr[i]= arr[j];
        arr[j]= k;
    }
    public static int[] nextLargest(int[] arr){
        int n= arr.length -1;
        int min=0;
        int swapIndex= 0;
        int elementtoSwap=0;
        int sortIndex=0;
        for(int i=n; i>0;i--){
            if(arr[i-1]<arr[i]){
                min= i;
                sortIndex=i;
                elementtoSwap= arr[i-1];
                swapIndex= i-1;
            }

        }
        System.out.println(elementtoSwap);
        for(int j= min+1;j<=n;j++){
            if(arr[j]>elementtoSwap && arr[j]<arr[min]){
                min= j;
            }
        }
        System.out.println(arr[min]);


        swap(arr,swapIndex,min );
        Arrays.sort(arr,sortIndex, n+1 );

        return arr;
    }

    public static void main(String[] args){
        int[] arr={8,1,7,8,6,5};
        int[] b= nextLargest(arr);
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+ " ");
        }

    }
}
