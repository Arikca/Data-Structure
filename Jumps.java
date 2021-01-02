public class Jumps {
    public static int jump(int[] arr){
        int a= arr[0];
        int b= arr[0];
        int jumps=1;
        for(int i=1; i<arr.length;i++){
            if(i== arr.length-1){
                return jumps;
            }
            a--;
            b--;
            if(arr[i]>b){
                b= arr[i];
            }
            if(a==0){
                jumps++;
                a=b;
            }
        }
        return jumps;
    }


    public static void main(String[] args){
        int[] arr= {1,3,5,8,9,2,6,7,6,8,9};
        int s= jump(arr);
        System.out.println(s);
    }
}
