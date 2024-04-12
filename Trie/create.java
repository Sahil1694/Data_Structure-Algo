package Trie;

public class create {
    static class Node{
        Node chilren[] = new Node[26];
        boolean eow = false;

        Node(){
          for(int i = 0 ; i < 26 ; i++){
            chilren[i] = null;
          }
        }
    }

    public static Node root = new Node();

    //insert in  trie;
    public static void insert(String word){
        Node curr = root;
        for(int level = 0 ; level < word.length(); level++){
           int idx = word.charAt(level) -'a';
            if(curr.chilren[idx] == null){
                curr.chilren[idx] = new Node();
            }
            curr = curr.chilren[idx];
        }
        curr.eow = true;
    }


    //search in trie;
    public static boolean search(String key){
        Node curr = root;
        for(int level = 0 ; level < key.length(); level++){
            int idx = key.charAt(level) - 'a';
            if(curr.chilren[idx] == null){
                return false;
            }
            curr = curr.chilren[idx];
        }
      return curr.eow == true;
    }
    public static boolean wordbreak(String key){

      for(int i= 1 ; i<= key.length() ; i++){
        if(key.length() == 0){
          return true;
        }
        //substring(0 , last idx(i))
        if(search(key.substring(0, i)) &&
        wordbreak(key.substring(i))){
          return true;
        }
      }
      return false;
    }
 public static void main(String[]args)  {
    String word[] = {"the","a","there","their","any","there"};
    for(int i = 0; i <word.length ; i++){
        insert(word[i]);
    }
    String key = "the";
    System.out.println(wordbreak(key));
  }
}
