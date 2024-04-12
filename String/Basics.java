package String;

public class Basics {
//Is palindrome
    public static boolean palindrome(String a) {
        int n = a.length();
        for(int i = 0 ; i < a.length()/2;i++){
            if(a.charAt(i) == a.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    //shortest path
    public static float Path(String a){
        int x = 0;
        int y =0;
      for(int i = 0; i < a.length();i++){
        char dir = a.charAt(i);
        if(dir =='S'){
            y--;
        }else if(dir == 'N'){
            y++;
        }else if(dir == 'E'){
            x--;
        }else if(dir == 'W'){
            x++;
        }
      }
      int x2 = x*x;
      int y2 = y*y;
      return (float)Math.sqrt(y2 +x2);
    }

    //compress
    public static String compress(String a){
        String newstr = " ";
        for(int i =0; i < a.length(); i++){
            Integer count = 1;
            while(i < a.length()-1 && a.charAt(i) == a.charAt(i +1)){
                  count++;
                  i++;
            }
             newstr += a.charAt(i);
             if(count > 1){
                newstr += count.toString();
             }
        }
        return newstr;
    }


    //1st letter to Upper case


    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder(" ");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1 ; i < str.length(); i++ ){
            if(str.charAt(i) == ' ' && i < str.length() -1 ){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main (String args[]) {
        String a = "sahil ";
        System.out.println(toUpperCase(a)); 
        
    }
    
}
