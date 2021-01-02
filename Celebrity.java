//use a matrix to reflect if a knows b
//if a knows b, then a isn't a celeb
//if a doesnt know b, then b cant be a celeb;

public class Celebrity {
    public static int findCelebrity(int[][] arr){
        int celeb=0;
        int x=0;
        int y= arr.length-1;
        while(x<y){
            if(arr[x][y]==1){
                x++;
            }
            else{
                y--;
            }
        }
        boolean a= true;
        for(int i=0;i<arr.length;i++){
            if(arr[x][i]!= 0){
                a= false;
            }
        }
        boolean b= true;
        for(int i=0;i<arr.length;i++){
            if(arr[x][y] != 0){
                b= false;
            }
        }
        if(a && b){
            return x;
        }
        return -1;
    }
    public static void main(String[] args){
        int[][] arr= {{0,0,1,0}, {0,0,1,0}, {0,0,0,0}, {0,0,1,0}};
        int a= findCelebrity(arr);
        System.out.println(a);
    }
}
