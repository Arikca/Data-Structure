public class Printingtheouternodes {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data= data;
            left= null;
            right= null;
        }
    }
    //program to print all the boundry nodes in O(n) time
    //1. print the head node
    //2. print the left internal nodes
    //3. print the right internal nodes
    //4. print the leaf nodes
    public static void leftInternalNodes(Node node){
        if(node != null){
            if(node.left != null){
                System.out.print(node.data+ " ");
                leftInternalNodes(node.left);
            }
            else if(node.right != null){
                System.out.print(node.data+" ");
                leftInternalNodes(node.right);
            }
        }
    }

    public static void rightInternalNodes(Node node){
        if(node != null){
            if(node.right != null){
                rightInternalNodes(node.right);
                System.out.print(node.data + " ");
            }
            else if(node.left != null){
                rightInternalNodes(node.left);
                System.out.print(node.data+ " ");
            }
        }
    }

    public static void printLeafNodes(Node node){
        if(node != null){
            printLeafNodes(node.left);
            if(node.left == null && node.right== null){
                System.out.print(node.data+ " ");
            }
            printLeafNodes(node.right);
        }
    }

    public static void main(String[] args){
        Node a= new Node(12);
        Node b= new Node(3);
        Node c= new Node(14);
        a.left= b;
        a.right= c;
        Node head= a;
        System.out.print(a.data + " ");
        leftInternalNodes(a.left);
        printLeafNodes(a);
        rightInternalNodes(a.right);
    }
}
