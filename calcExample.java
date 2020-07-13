//Example of a basic java calculator
//User inputs 2 numbers and mathematical function and program will output answer

import java.util.Scanner;

public class calcExample
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      double pounds;
      double cost; 
      
      System.out.println("Please enter the number of pounds: ");
      pounds = sc.nextDouble();
      
      if (pounds >= 2)
      {
         cost = pounds * 3.;
      }
      
      else
      {
         cost = pounds * 2.5;
      }
      
      System.out.printf("The cost is $%.2f " ,cost);
   }  
}