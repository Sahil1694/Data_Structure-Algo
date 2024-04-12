import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

import javax.management.relation.Role;

public class heightOfTree {
    static class Node{
        int data;
        Node left, right;

        public Node( int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1 ;
    }



    
    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1;
        }

    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum + rightSum +root.data;
    }
    public static int diam(Node root){
        if(root == null){
            return 0;
        }
        int ldiam = diam(root.left);
        int rdiam = diam(root.right);
        int lh = height(root.left);
        int rh = height(root.right);
        int selfDiam = rh + lh +1;
        return Math.max(Math.max(rdiam, ldiam), selfDiam);

    }




    public static int diam2(Node root){
        if(root == null){
            return 0;
        }
        int ldiam = diam2(root.left);
        int rdiam = diam2(root.right);
        int lh = height(root.left);
        int rh = height(root.right);
        int selfDiam = rh + lh +1;
        return Math.max(Math.max(rdiam, ldiam), selfDiam);

    }
    static class Info{
        int diam;
        int ht;
        public Info(int diam , int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameter(Node root){
        if(root == null){
            return new Info(0, 0);
        }

        Info leInfo = diameter(root.left);
        Info rInfo = diameter(root.right);
        
        int diam = Math.max(Math.max(leInfo.diam, rInfo.diam), leInfo.ht+rInfo.ht+1);
        int ht = Math.max(leInfo.ht, rInfo.ht)+1;

        return new Info(diam, ht);
    }

    public static boolean isIdentical(Node node , Node subRoot) {
          if(node == null && subRoot == null){
            return true;
          } 
        
    }

    public static boolean isSubtree(Node root , Node subRoot) {
        if(root == null){
            return false;
        }

        if(root.data == subRoot.data){ 
            if(isIdentical(root , subRoot)){
                return true;
            }
        }


        return isSubtree(root.left, subRoot) ||  isSubtree(root.right, subRoot);

        
    }
    static class Info{
        Node node;
        int hd;

        public Info(Node node , int hd){
            this.node = node;
            this.hd = hd;
        }
    }
  public static void topView(Node root) {
    //level order
    Queue<Info> q = new LinkedList<>();
    HashMap<Integer, Node> map = new HashMap<>();


    int min = 0, max = 0;
    q.add(new Info(root, 0));
    q.add(null);

    while(!q.isEmpty()){
        Info curr = q.remove();
        if(curr == null){
            if(q.isEmpty()){
                break;
            }else{
                q.add(null);
            }
        }else{
            if(!map.containsKey(curr.hd)){// first time my hd is occuring
                map.put(curr.hd, curr.node);
         }
 
         if(curr.node.left != null){
             q.add(new Info(curr.node.left, curr.hd -1));
             min = Math.min(min, curr.hd-1);
         }
 
         if(curr.node.right != null){
             q.add(new Info(curr.node.right, curr.hd +1));
             max = Math.max(max, curr.hd+
             
             1);
         }
        }

        
    }
    for(int i = min ; i <=max ; i++){
        System.out.println(map.get(i).data + "  ");
    }
    System.out.println();
    
  }

  public static void Klevel(Node root , int level, int k ){
    if(root == null){
        return;
    }
    if(level == k){
        System.out.println(root.data);
        return;
    }
    Klevel(root.left, level+1, k);
    Klevel(root.right, level+1, k);
  }

   public static boolean getpath(Node root, int n , ArrayList<Node> path ) {
    if(root == null){
        return false;
    }
           path.add(root);

           if(root.data == n){
            return true;
           }
        boolean foundleft = getpath(root.left, n, path);
        boolean foundRight = getpath(root.right, n, path);

        if(foundleft || foundRight  ){
            return true;
        }

        path.remove(path.size() -1);
        return false;
    
   }

   public static Node LCA(Node root , int n1, int n2 ) {
    ArrayList<Node> path1 = new ArrayList<>();
    ArrayList<Node> path2 = new ArrayList<>();


    getpath(root, n1, path1);
    getpath(root, n2 , path2);

    //last common ancestor

    int i = 0;
    for( ; i < path1.size() && i < path2.size(); i++){
        if(path1.get(i) != path2.get(i)){
            break;
        }
    }
    // last equal node
    Node lca = path1.get(i - 1);
    return lca;


    
   } 

    public static void main(String args[]) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new  Node(4); 
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right  = new Node(7 );





        int n1 = 4, n2 = 5;
        int k = 2;

        Klevel(root,1, k);



     topView(root);
       SubTree
        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);
    
        System.out.println(height(root));
        System.out.println(count(root));
        System.out.println(sum(root));
        System.out.println(diam(root));
        System.out.println(diameter(root).diam);
    }
    
}
