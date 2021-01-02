public class ArrayOverlappingRecatangles {
   static class Point{
        int x;
        int y;
        Point(int x,int y){
            this.x= x;
            this.y= y;
        }
    }
    public static boolean overlapping(Point s1, Point s2, Point p1, Point p2){
        if(s1.y < p2.y || s2.y< p1.y){
            return false;
        }
        if(s1.x >= p2.x || s2.x> p1.x){
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        Point s1= new Point(0,0);
        Point s2= new Point(2,2);
        Point p1= new Point(1,1);
        Point p2 = new Point(3,3);
        boolean a= overlapping(s1, s2, p1, p2);
        if(a){
            System.out.println("pverlapping");
        }
        else{
            System.out.println("notoverlapping");
        }

    }
}
