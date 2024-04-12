import java.util.*;

public class Basics {

    
    public static float fact(Float n) {
        float f =1;
        for(int i =1; i <=n; i++){
            f=f*i; 
        }
        return f;
        
    }
    public static float binoial(Float n, Float r){
       float  n_fact = fact(n);
       float r_fact = fact(r);
       float k = (n-r);
       float h = fact(k);
       float c = r_fact*h;
       float o = n_fact/c;
       return o;
    }


    public static void binTonum(int binNum) {
        int pow = 0;
        int decnum = 0;

        while(binNum>0){
            int ld = binNum %10;
            decnum = decnum + (ld * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum /10;   
        }
  System.out.println(decnum);        
    }


    public static int ave(int a,int b,int c) {
        int k = a+b+c;
        int m = k/3;
        return k;
    }


    private static void hollow_rect(int totrows, int totcols) {
        for(int i = 0; i<= totrows; i++){
            for(int j = 1;j <= totcols;j++){
                if(i==1 || i==totrows || j==1 || j==totcols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
         }
    }
    
    public static void inv(int row) {
        for(int i = 0; i <= row;i++){
            //space
            for(int j = 1; j <=  row-i; j++){
                System.out.print(" ");
            }
            //star
            for(int j =1; j <= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
        public static void greatest(int Marks[] ) {
             int largest = Integer.MIN_VALUE;
             int smallest = Integer.MAX_VALUE;

             for(int i = 0; i <= Marks.length -1; i++ ){
                   if(Marks[i] > largest){
                    largest = Marks[i];
                   }
                   if(Marks[i] < smallest){
                    smallest = Marks[i];
                   }

             }
             System.out.println(largest  + "," + smallest);


            // for(int i = 0; i <= Marks.length - 1 ; i++){
            //     if(Marks[i] == key){
            //         System.out.println("key found");
            //         break;
            //     }
            //     }
            //     System.out.println("Key Not Found");
            // }


        }

         public static void reverse(int Marks[]) {
            int first = 0;
            int last = Marks.length -1;
            while(first<= last){
                int temp = Marks[last];
                Marks[last] = Marks[first];
                Marks[first] = temp;
                
                first ++;
                last --;
            }
            
            
         }

         public int search(int[] nums, int target) {
            int low = 0, high = nums.length - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (nums[mid] == target)
                    return mid;
    
                if (nums[low] <= nums[mid]) {
                    if (nums[low] <= target && target <= nums[mid])
                        high = mid - 1;
                    else
                        low = mid + 1;
                } else {
                    if (nums[mid] <= target && target <= nums[high])
                        low = mid + 1;
                    else
                        high = mid - 1;
                }
            }
            return -1;
        }


            
        }
        public static void printfuc (int Marks[]) {

                    
        }

        public static void subarryas(int Marks[]) {
               
               for(int i = 0; i <= Marks.length -1; i++){
                  int curr = Marks [i];
                  for(int j = i+1; j <= Marks.length-1; j++ ){
                    System.out.println(curr + "," + Marks[j]);
                  }
                  System.out.println();
               }

            
        }
        
        
    


    public static void main(String args[]) {
        Scanner scn= new Scanner(System.in);
        // binTonum(111);
         int sum = 0;
        for(int i =0 ; i <=10 ; i++){
            sum = sum +i;

        }
    System.out.println(sum);

    int Marks[] = {1,2,6, 8};
    reverse(Marks);
    for(int i = 0 ; i <= Marks.length-1; i++){
        System.out.println(Marks[i]);
    }

    subarryas(Marks);
    
    




inv(4);
         

// int n = scn.nextInt();
// int div = 0;
// for(int i = 1 ; i<= n ;i++){
//     if(n %i ==0){
//         div++;
//     }
// }
// if(div==2){
//     System.out.println("prime");
// } else{
//     System.out.println("not prime");
// }
// calu(5,5);







// int n = 4;
// char ch ='A';


// for(int i = 0; i<=4;i++){
//     for( int chars= 1;chars<=i;chars++){
//         System.out.print(ch);
//         ch++;

//     }
//     System.out.println();
// }




        // for(int i = 0; i <=4;i++){
        //     System.out.println("****");
        // }
// int a = 0;
// while(a<10){
//     a+=1;
//     System.out.println(a);
// }   
// int n =4;     
// for (int line = 1 ; line <=4;line++){
//     for(int j =1 ;j<=line;j++){
//         System.out.print(j);
//     }
//     System.out.println();
// }















// int n = 10;
// int sum = 0;
// int i =0;


// while(n  0){
//     sum = sum +i;
//     i++;
    
// }
// System.out.println(sum);



// int rev = 0;

// while( n>0){
//     int ld = n%10;
//     rev = rev *10 + ld;
//     n = n/10;
   

// }
// System.out.println(rev);


















// int a = 0;
// int i = 1;

// while(i <= n){
//     sum+=i;

// }



// if(a%4==0){
//     if(a%100==0){
//         if(a%400==0){
//             System.out.println("Leap Year");
//         }else{
//             System.out.println("no Leap");
//         }
    
//     }
//     else{
//         System.out.println("leap");
//     }
// }else{
//     System.out.println("No leap");
// }



// switch(a){
//     case 1 :
//          System.out.println("Monday");
//          break;
//     case 2 :
//          System.out.println("tuesday");
//          break;
//     case 3:
//          System.out.println("wednesday");
//          break;          
// }





        // double temp=5;
        // if (temp >= 100.0){
        //     System.out.println("you have a fever");
        // }
        // else{
        //     System.out.println("you dont have fever");
        // }


// int a = scn.nextInt();
// if (a==0){
//     System.out.println("its a zero");
// }
// else if (a > 0){
//     System.out.println("positive");
// }
// else{
//     System.out.println("negative");
// }


// int b = scn.nextInt();
// int c = scn.nextInt();

// if (a==b && b==c){
//     System.out.println("all are equal");
// }
// else if(a > b && a > c){
//     System.out.println(a+"is greatest");
// }



// else if(b > a && b >c){
//     System.out.println(b + "is greatest");
// }
// else{
//     System.out.println(c+"is greatest");
// }

// int a = scn.nextInt();
// System.out.println(a + "num");
// if(a%2==0){
//     System.out.println("Even");
// }
// else{
//     System.out.println("odd");
// }



       // Question1:In a program,input 3 numbers:A,B and C.You have to output the average of these 3 numbers
    //    int a = scn.nextInt();
    //    int b = scn.nextInt();
    //    int c = scn.nextInt();


    
    //    int d = a+b+c;
    //    System.out.println(d/3);

       //Question 2 : In a program,input the side of a square.You have to output the area of the square.
    //    float side = scn.nextFloat();
    //    System.out.println(side * side); 


    //    Question 3:Enter cost of 3 items from the user(using float datatype)-a pencil,a pen and an eraser. You have to output the total cost
    //     of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem
    // float x = scn.nextFloat();
    // float y = scn.nextFloat();
    // float z = scn.nextFloat();
    // float percent = 0.18f;
    // float bill = x+y+z;
    // float  gst = bill * float(18/100);

    // System.out.println(percent);
    }
}
 