package Recursion;

public class P11 {
     
    public static void removedub(String str, int idx, StringBuilder newStr, boolean map[]) {
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        //kaam
        char cuuchar = str.charAt(idx);
        if(map[cuuchar - 'a'] == true){
            //duplicate
            removedub(str, idx +1, newStr, map);
        }else{
            map[cuuchar - 'a'] = true;
            removedub(str, idx +1, newStr.append(cuuchar), map);
        }       
    }
     public static void main(String args[]) {
        String str = "appnnacollege";
        removedub(str, 0, new StringBuilder(" "), new boolean [26]);
     }
}
