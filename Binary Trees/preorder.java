import java.util.LinkedList;
import java.util.Queue;

public class preorder {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
    //building Preorder tree
    static class BinaryTree{
        static int idx = -1; 
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

     //pre order traversal   
        public static void preorder(Node root) {
            if(root == null){
                return;
            }
            System.out.println(root.data+ "");
            preorder(root.left);
            preorder(root.right);
        }

        //inorder traversal
        public static void inorder(Node root) {
            if(root == null){
                return;
            }
            inorder(root.left);
            inorder(root.right);
            System.out.println(root.data);
        
        }
        //level order treversal
        public static void LeveOreder(Node root) {
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.println(currNode.data);
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
            
        }
    }    

    public static void main(String args[]) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root =  tree.buildTree(nodes);
        System.out.println(root.data);

        tree.LeveOreder(root); 


        
    }
    
}
