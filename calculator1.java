
// simple calculator in java  using switch


package com.mycompany.calculator1;
import java.util.Scanner;



public class Calculator1 {

    public static void main(String[] args)
    {
         System.out.println(" Enter two operands for your desired Ar. op. ");  // msg for user 
         Scanner obj = new Scanner(System.in);
         float x = obj.nextFloat();         // taking ist unput from user
         float y = obj.nextFloat();         // taking 2nd unput from user
         System.out.println("enter  \n 1 for sum \n 2 for sub \n 3 for multiply \n 4 for division ");  // showing choice to user
         int z = obj.nextInt();                 //  taking user choice
         switch(z)
         {
             case 1 -> System.out.println(" sum=" +(x+y));         
             case 2 -> System.out.println(" sub=" +(x-y));
             
             case 3 -> System.out.println(" multiply=" +(x*y)); 
                 
             case 4 -> System.out.println(" div=" +(x/y));
                  
             default -> System.out.println("enter valid details as asked to enter");   // if user entered wrong choice
         }
    }
}
