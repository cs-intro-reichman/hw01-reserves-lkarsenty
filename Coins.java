public class   Coins {
   public static void main(String[] args) {
      int sum = Integer.parseInt(args[0]);
      int quarters = sum/25;
      int cents = sum%25;
      System.out.println("Use " + quarters + " quarters and " + cents + " cents");
   }
}
