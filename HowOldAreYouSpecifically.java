/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment1_10528808;

/**
 *
 * @author Mawutor
 */
import java.util.Scanner;
public class HowOldAreYouSpecifically 
{
    public static void main(String[] arg)
    {
        Scanner input=new Scanner(System.in);
        int age;
        String name;
        
         System.out.println("What is your name,sorry I keep forgetting");
         name=input.next();
         System.out.printf("Ok,%s how old are you?",name);
         age=input.nextInt();
         if(age<16)
            {
                System.out.println("You Can't Drive");
            }
         else if(age==16||age==17)
         {
             System.out.printf("s% you can drive but you can't vote",name);
         }
         
          else if(age>=18 && age<=24)
         {
             System.out.printf("%s,you can vote but cannot rent a car",name);
         }
         
          else if(age>=25)
         {
             System.out.printf("%s, you can do pretty much everything",name);
         }
    }
}

        