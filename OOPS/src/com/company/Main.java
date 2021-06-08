package com.company;
import java.util.*;
class Student{


     static int a = 10;
     static int b = 20;

     public Student(int a,int b)
     {
         this.a = a;
         this.b= b;
     }
     public int getSum()
     {   //static int c = 30;
         return a+b;
     }

}


public class Main {

    static{
        System.out.println("hi");
    }
    public static void main(String[] args) {
        // write your code here
        //long b = 1;
      // Student obj = new Student(10,20);
        final int k;
        k = 10;
        System.out.println(Student.a);
    }
}
