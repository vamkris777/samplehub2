package Overload;

import javax.swing.*;

public class Overloading {
   void color(int a,int b){
       System.out.println("by using integer values:" +(a + b));
    }
    void color(float a, float b){
        System.out.println("by using float values:" +(a + b));
    }
}
