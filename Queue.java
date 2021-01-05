public class Queue {

    static public class Queue{
        static int size = 4;
        static int queue[] = new int[size];
        static int front, rear;

        Queue(){
            rear=-1;
            front=-1;
        }
        public static void enQueue(int element){
            if(isFull()){
                System.out.println("Queue is full");
            }
            else{
                if(front== -1) {
                    front = 0;
                }
                    rear++;
                    queue[rear] = element;
                    System.out.println("inserted "+ element);

            }
        }


       public static int deQueue(){
            int element;
            if(isEmpty()){
                System.out.println("Queue is empty");
                return(-1);
            }
            else{
                element= queue[front];
                front++;
            }
            return element;

       }

       public static boolean isFull() {
            if(rear== (queue.length-1)){
                return true;
            }
            else{
                return false;
            }
       }

       public static boolean isEmpty(){
            if(front== -1){
                return true;
            }
            else{
                return false;
            }
       }

    }



   public static void main(String[] args){
        Queue q= new Queue();
        q.enQueue(12);
        q.enQueue(2);
        System.out.println(q.deQueue());
   }

}
