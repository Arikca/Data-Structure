class LinkedList {
    static class Node  //inner class
    {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head=null;
    Node tail= null;
    public void insert(Node head,int data){

        Node newnode= new Node(data);
        if(head == null){
            head= newnode;
            tail= newnode;
        }
        else{
            tail.next= newnode;
            tail= newnode;
        }
    }

    //traversing a linked list
    public void traverse(Node head){
        if(head == null){
            System.out.println("list is empty");
        }
        else{
            Node temp= head;
            while(temp!= null){
                System.out.print(temp.data);
                temp= temp.next;
            }
        }
    }

    //deleting a Node
    public void delete(Node head, int value){
        if(head == null){
            System.out.println("List is emplty");
        }
        else{
            //if thr data matches the head node data
            if(head.data== value){
                head= head.next;
            }
            else{
                Node temp = head.next;
                Node prev= head;

                while(temp != null){
                    if(temp.data == value){
                        prev= temp.next;
                        return;

                    }
                    else{
                        prev= prev.next;
                        temp= temp.next;
                    }
                }
            }


        }
    }

    //inserting a node in a given index i.e value after which a noew node needs to be inserted
    public void insertPosition(Node head, int value, int data){
        Node newnode= new Node(data);
        if(head== null){
            System.out.println("Cant add");
            return;
        }
        else{
            if(head.data == value){
                newnode.next = head.next;
                head.next = newnode;
            }
            else{
                Node temp= head.next;
                Node prev= head;
                while(temp != null){
                    if(temp.data== value){
                        newnode.next= temp.next;
                        temp.next= newnode;
                        return;
                    }
                    else{
                        temp= temp.next;
                        prev= prev.next;
                    }
                }

            }

        }

    }

    //merge two sorted linked lists time complexity is O(n) and space complexity is O(1) as no extra space is required.
    //just by changing refernces

    public static Node merge_list(Node first, Node second, Node temp){
        Node newlist = null;
        if(first== null){
            return second;
        }
        if(second== null){
            return first;
        }

        if(first.data <= second.data){
            temp= first;
            first= temp.next;
        }
        else {
            temp = second;
            second= temp.next;
        }
        newlist = temp;

        while(first != null && second != null){
            if(first.data <= second.data){
                temp.next= first;
                temp= first;
                first= temp.next;
            }
            else{
                temp.next= second;
                temp= second;
                second= temp.next;
            }
        }

        if(first== null){
            temp.next = second;
        }
        if(second== null){
            temp.next= first;
        }
        return newlist;
    }

    //sort linked list using merge sort time complexity O(nlogn)
    public static Node mergeSort(Node node){
        if (node == null || node.next == null){
            return node;
        }

        Node middle= find_middle(node);
        Node middle_next= middle.next;

        middle.next = null;

        Node first= mergeSort(node);
        Node second= mergeSort(middle_next);
        Node temp= null;
        Node sortedList= merge_list(first, second, temp);
        return sortedList;
    }

    public static Node find_middle(Node head){
        Node middle= head;
        Node middleByTwo = head;
        while(middleByTwo != null && middleByTwo.next != null){
            middleByTwo= middleByTwo.next.next;
            middle= middle.next;
        }

        return middle;
    }

    public static void main(String[] args){
        Node a= new Node(10);
        Node b= new Node(20);
        Node c= new Node(30);
        a.next= b;
        b.next= c;
        Node answer= find_middle(a);
        System.out.println(answer.data);
    }
