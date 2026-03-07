public class ArrayExercises {
    /** Returns the second to last item in the given array.
     *  Assumes the array has at least 2 elements. */
    public static String secondToLastItem(String[] items) {
        return items[items.length - 2];
    }    

    /** Returns the difference between the minimum and maximum item in the given array */
    public static int minMaxDifference(int[] items) {
        int max = items[0];
        int min = items[0];
        for (int k = 1; k <= items.length - 1; k ++){
            if (max <= items[k]){
                max = items[k];
            }
            if (min >= items[k]){
                min = items[k];
            }
        }
        return max - min;
    }
}
