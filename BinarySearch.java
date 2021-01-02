public class BinarySearch {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        int result = BinarySearch(arr, 4, 0, 4);
        System.out.println(result);
    }

    static int BinarySearch(int[] array, int key, int low, int high){

        if(low> high){
            return -1;
        }
        int mid= low + ((high- low) / 2);
        if(array[mid]== key){
            return mid;
        }
        else if(key< array[mid]){
            return BinarySearch(array, key, low, mid-1);
        }

        else{
            return BinarySearch(array, key, mid+1, high);
        }

    }
}
