public class   Triangle {
   public static void main(String[] args) {
      int lengh1 = Integer.parseInt(args[0]);
      int lengh2 = Integer.parseInt(args[1]);
      int lengh3 = Integer.parseInt(args[2]);
      
      if (lengh1 + lengh2 > lengh3 && lengh1 + lengh3 > lengh2 && lengh2 + lengh3 > lengh1) {
         
         System.out.println(lengh1 + ", " + lengh2 + ", " + lengh3 + ": true "); 

    } else {
         
         System.out.println(lengh1 + ", " + lengh2 + ", " + lengh3 + ": false ");
    }

   }
}
