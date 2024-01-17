
import java.io.*;
import java.util.*;

public class   GenThree {
   public static void main(String[] args) {
      int min = Integer.parseInt(args[0]);
      int max = Integer.parseInt(args[1]);

      int num1 = min + (int) (Math.random () * ( (max - min - 1) + 1));
      int num2 = min + (int) (Math.random () * ( (max - min - 1) + 1));
      int num3 = min + (int) (Math.random () * ( (max - min - 1) + 1));

      System.out.println(num1);
      System.out.println(num2);
      System.out.println(num3);

      if (num1<=num2 && num1<=num3) {
         System.out.println("The minimal generated number was " + num1);
      } else if (num2<=num1 && num2<=num3) {
         System.out.println("The minimal generated number was " + num2);
         } else {
         System.out.println("The minimal generated number was " + num3);
      }


   }
}

