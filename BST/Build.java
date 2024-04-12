package BST;

import java.util.ArrayList;

public class Build {
    static class Node{
        int data;
        Node left;
        Node right;
    
    Node(int data){
        this.data = data;
    }
}  
      public static Node insert(Node root , int val) {
        if(root == null){
            root = new Node(val);
            return root;
        }


        if(root.data > val){
            // insert subtree
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
      return root;  
      }
      public static void inorder(Node root) {
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+ " ");
        inorder(root.right);
        
      }

       public static boolean search(Node root , int key) {
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }
        if(root.data > key ){
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }
        
       }

       public static Node delete(Node root , int val) {

        if(root.data < val){
            root.right = delete(root.right, val);
        }
        else if(root.data > val){
            root.left = delete(root.left, val);
        }
        else{
            //case 1 leaf Node
            if(root.right == null && root.left == null){
                return null;
            }
            //case 2 single child
            if(root.left == null){
               return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            //case 3 Both childeren
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }
        return root;
        
       }

       public static Node findInorderSuccessor(Node root) {
        while(root.left != null){
            root = root.left;
        }
        return root;
        
       }
       public static void printinRange(Node root, int k1 , int k2) {
        if(root==null){
            return;
        }
        if(root.data >= k1 && root.data <=k2 ){
            printinRange(root.left, k1, k2);
            System.out.println(root.data +" ");
            printinRange(root.right, k1, k2);
        }
        else if(root.data < k1){
            printinRange(root.left, k1, k2);
        }else{
            printinRange(root.right, k1, k2);
        }
        
       }
        public static void printPath(ArrayList<Integer> path) {
            for(int i = 0 ; i<path.size(); i++){
                System.out.print(path.get(i) + ">");
            }
            System.out.println();
            
        }

       public static void root2leaf(Node root , ArrayList<Integer> path) {
        if(root ==null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right ==null){
            printPath(path);
        }
        root2leaf(root.left, path);
        root2leaf(root.right, path);
        path.remove(path.size() - 1);

        
       }

       public static boolean isValid(Node root, Node min , Node max) {

        if(root==null){
            return true;
        }
        if(min != null && root.data <= min.data){
              return false;
        }
        else if(max!= null && root.data >=max.data){
             return false;
        }

        return isValid(root.left, min, root)
               && isValid(root.right, root, max);


        
       }

      public static void main(String args[]) {
         int values[] = {8,5,3,1,4,6,10,11,14};
         Node root = null;
           

         for(int i = 0; i <values.length; i++){
             root = insert(root, values[i]);
         }

         inorder(root);
         System.out.println();
         
         if(search(root, 0)){
            System.out.println("Found");
         }else{
            System.out.println("Not found");
         }

         root = delete(root, 14);
         System.out.println();

         inorder(root);

        System.out.println();
         printinRange(root, 3, 11);

         root2leaf(root, new ArrayList<>());


     if(isValid(root, null, null)){
        System.out.println("Valid");
     }else{
        System.out.println("Not valid");
     }


      }

      
    
}
