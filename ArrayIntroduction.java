class ArrayIntriduction{
  public static void main(String[] args){
    //array declarations'
    int[] age= new int[10];
    //array initialization
    int[] age= {12, 5, 4, 2, 6};
    //accessing array element: array[index]
    age[3]
    //looping throughan Array
    for(int i=0;i<age.length;i++){
      System.out.print(age[i] + " ");
    }

    //for -each loop in java
    for(int a: age){
      System.out.print(a+ " ");
    }
  }
}
