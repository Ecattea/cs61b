public class PrintIndexed {
   /**
     * Prints each character of a given string followed by the reverse of its index.
     * Example: printIndexed("hello") -> h4e3l2l1o0
     */
   public static void printIndexed(String s) {
      int n = s.length();
      StringBuilder sb = new StringBuilder(n * 2);
      for (int i = 0; i < n; i++) {
         sb.append(s.charAt(i));
         sb.append(n - 1 - i);
      }
      System.out.println(sb.toString());
   }

   public static void main(String[] args) {
      printIndexed("hello");
      printIndexed("cat"); // should print c2a1t0
   }
}
