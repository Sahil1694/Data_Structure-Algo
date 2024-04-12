package OPPS;

import java.lang.invoke.WrongMethodTypeException;
import java.rmi.ConnectIOException;

public class Basics {
    public static void main(String args[]) {
        // Pen p1 = new Pen();
        // p1.setColor("blue");
        // System.out.println(p1.getColor());

        // BankAccount myAcc = new BankAccount();
        // myAcc.username = "Sahil";
        // myAcc.setPassword("ss");
        // Student s1 = new Student();
        // Student s2 = new Student("Sahil");
        // Student s3 =  new Student(123);
        

        // fish shark = new fish();
        // shark.eat();
           
        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);

    //    Calculator cal = new Calculator();
    //    System.out.println(cal.sum(4,5,1));
        Hourse h = new Hourse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();;
        c.eat();
        c.walk();

        
    }
    
}

abstract class Animal{
    void eat(){
        System.out.println("Animal");
    }
    abstract void walk();

}
class Hourse extends Animal{
    void walk(){
        System.out.println("walk on 4 legs");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("Walk on 2 legs");
    }
}






class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum (float a , float b){
        return a+b;
    }
    int sum(int a, int b,int c){

        return a+b+c;
    }
}







//inheritance
//base class
// class Animal{
//     String color;

//     void eat(){
//         System.out.println("eat");
//     }

//     void breath(){
//         System.out.println("breath");
//     }
// }
// class Mammmals extends Animal{
//     void walk() {
//         System.out.println("walk");
//     }

// }
// class Dog extends Mammmals{
//     String breed;
// }
//derived class
// class fish extends Animal {
//     int fins;
//     void swim(){
//         System.out.println("Swims");

//     }
// }

class Student{
    String name;
    int roll;

    Student(){
        System.out.println("this is con");
    } 
    Student(String name){
        this.name= name;
    }
    Student(int roll){
        this.roll = roll;
    }

}
class BankAccount{
    public String username;
    public String password;
    public void setPassword(String pwd) {
        password =pwd;
        
    }

}
class Pen {
    private String color;
    private int tip;
    String getColor(){
        return this.color;
    }

    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}