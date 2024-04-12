package LinkedList;

public class Linked {
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

    //Add at first pos
    public void addFirst(int data){
        //step1 = create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        // step2 = new nodenext = head
        newNode.next = head; //link

        // step3 = head = new Node
        head = newNode;
    }

    public void insertNodeAtAnyLocation(int data, int position) {
        if (position < 1 || position > size + 1) {
            System.out.println("Invalid position. Node not inserted.");
            return;
        }

        Node newNode = new Node(data);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 1; i < position - 1; i++) {
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
        }

        size++;
        System.out.println("Node with data " + data + " inserted at position " + position);
    }

   //Add at last pos
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail =newNode;
    }

    //print LL(Display LL )
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


    //add in middle
    public void add(int idx, int data){
        if(idx==0){
            addFirst(data);
            return; 
        }
        Node newNode  =new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        //i = idx -1; temp -> prev
        newNode.next=temp.next;
        temp.next = newNode;
    }

    //remove first element
    public int removeFirst(){
        if ( size ==0){
            System.out.println("LLsis empty");
            return Integer.MAX_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail=null;
            return val;
        }
        int val = head.data;
        head = head.next;
        return val;
    }



    //remove last
    public int removeLast(){
        if(size==0){
            System.out.println("empty");
        }else if (size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev : size -2
        Node prev = head;
        for(int i = 0; i< size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }


    //iterative search
    public int itrSearch(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }


   //recursive search
    public int helper(Node head,int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx +1;
    }
     
    public int recSearch(int key){
        return helper(head, key);
    }



   //Reverse The LL
    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }



    //to delete Nth node
    public void deleteNthTerm(int n){
        //cal size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(n==sz){
            head = head.next;
            return;
        }
        //sz-n
        int i = 1;
        int iToFind = sz -n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }

        prev.next= prev.next.next;
        return;
    }



    //get mid
    public Node getmid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;//midnode
    }


    //To Check If it is Pallindrome
    public boolean isPalindrome(){
        if(head == null || head.next == null){
            return true;
        }

        //step1 find mid
        Node midNode = getmid(head);
    

        //step2 reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;//right half head
        Node left = head;

        //step3 check left half & right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String args[]) {
        Linked ll = new Linked();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(1);
   
        ll.print();
        System.out.println(ll.isPalindrome());
        


        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.print();

        // ll.addLast(3);
        // ll.addLast(4);
        // ll.print();

        // ll.add(4, 5);
        // ll.print();
        // System.out.println(ll.size);
        // // ll.removeFirst();
        // ll.print();
        // // ll.removeLast();
        // ll.print();
        // System.out.println("size"+ll.size);

        // System.out.println(" sa "+ll.itrSearch(3));
        // System.out.println("rec" + ll.recSearch(3));
        // ll.reverse();
        // ll.print();
        // ll.deleteNthTerm(3);
        // ll.print();LinkedList ll = new LinkedList();



      
    }
    
}
