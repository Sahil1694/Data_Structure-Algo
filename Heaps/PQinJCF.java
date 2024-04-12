package Heaps;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PQinJCF {
   static class Student implements Comparable<Student>{ //overrinding
    String name;
    int rank;


       public Student (String name , int rank){
        this.name = name;
        this.rank = rank; 
       }

       @Override 
       public int compareTo(Student s2)  {
        return this.rank - s2.rank;
       }
   }
    public static void main (String args[]){

        PriorityQueue<Student>pq = new PriorityQueue<>();


        pq.add(new Student("A", 5));
        pq.add(new Student("B", 10));
         pq.add(new Student("C", 8));
          pq.add(new Student("D", 1));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name +"->" + pq.peek().rank);
            pq.remove();
            
        }

    }
    
}
