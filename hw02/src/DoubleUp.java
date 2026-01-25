public class DoubleUp {
   /**
     * Returns a new string where each character of the given string is repeated twice.
     * Example: doubleUp("hello") -> "hheelllloo"
     */
   public static String doubleUp(String s) {
      int n = s.length();
      StringBuilder sb = new StringBuilder(n * 2);
      for (int i = 0; i < n; i++) {
         char c = s.charAt(i);
         sb.append(c).append(c);
      }
      return sb.toString();
   }
   
   public static void main(String[] args) {
      String s = doubleUp("hello");
      System.out.println(s);
      
      System.out.println(doubleUp("cat"));
   }
}
