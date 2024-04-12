package BitManipulation;
public class oddev {

    public static void oddev(int num){
        int bitMask =1;
        if((num & bitMask)==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }

    public static int ithBit(int n , int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int SetIBit(int n , int i){
        int  bitMask  = 1 << i;
        return bitMask | n;
    }

    public static int clearIBit(int n , int i ){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int Update(int n , int i , int newBit){
        if(newBit == 0){
            return clearIBit(n, i);
        }else{
            return SetIBit(n, i); 
        }
    }
    public static int clearBits(int n , int i ){
        int bitMask = ((~0) << i);
        return bitMask & n;
    }

    public static int clearIBits(int n , int i , int j ){
        int a = (~0)<<(j+1);
        int b = (1<<i) -1;
        int bitMask = a | b;
        return bitMask & n;
    }

    public static boolean isPow2(int n){
        if((n & (n-1)) == 0){
            return true;
        }else{
        return false;
        }
    }
    public static int countSetBit(int n){
        int count  = 0;
        while (n>0){
            if((n & 1) != 0 ){
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    public static int FastExpo(int a , int n){
        int ans = 1;
        while (n > 0){
            if((n &1) != 0){//check LSB
                ans = ans *a;
            }
            a =a*a;
            n = n>>1;
        }
        return ans;
    }


    public static void main(String args[]){
        oddev(6);
        System.out.println(ithBit(2, 1));
        System.out.println(SetIBit(2, 0));
        System.out.println(isPow2(32));
        System.out.println(countSetBit(10));
        System.out.println(FastExpo(3, 5));
        
        
    } 
}
