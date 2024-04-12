package LinkedList;

public class ImpSum {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        } 
    }
    public static Node head;
    public static Node tail;
    public static int size;


//detect a loop/cycle in LL;
   public static void isCy() {
    Node slow = head;
    Node fast = head;
    boolean Cycle = false;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if(fast == slow){
            Cycle= true;
            System.out.println(Cycle);
            break;
        
        }
    }  
   }

   //remove a cycle in LL;
    public static void removecy(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean Cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                Cycle= true;
                break;
            }
        }
        if(Cycle==false){
            return;
        }
          //find meeting point
          slow = head;
          Node prev = null;//last Node
          while( slow != fast){
            prev = fast;
            slow = slow.next;
            fast=fast.next;
          }
          prev.next = null;

        
    }

    //merge sort on LL;
    
    private Node merge(Node head1 , Node head2){
          Node mergeLL = new Node(-1);
          Node temp = mergeLL;

          while(head1 !=null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
          }
          while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
          }

          while(head2 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
          }

          return mergeLL.next;

    }


    private Node getmid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;//midnode
    }


    
    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }

        //find Mid
        Node mid = getmid(head);

        //left And Righ MS
        Node rightHead = mid.next;
        mid.next = null;
       Node NewLeft =  mergeSort(head);
       Node NewRight  = mergeSort(rightHead);


        //merge
        return merge(NewLeft , NewRight);
    }
    public void print(){
        if(head == null){
            System.out.println("LL is empty");


        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"  ");
            temp = temp.next;
        }
        System.out.println();
    }
   

public static void main(String args[]) {
//     head = new Node(1);
//     Node temp =new Node(2);
//     head.next = temp;
//     head.next.next= new Node(3);
//     head.next.next.next =  temp ;

// isCy();
// removecy();
// isCy();

Linked ab = new Linked();
         ab.addFirst(1);
         ab.addFirst(2);
         ab.addFirst(3);
         ab.addFirst(4);
         ab.addFirst(5);

        //  ab.print();
        //  ab.head = ab.mergeSort(ab.head);
        //  ab.print();
         


 


    
   }
}