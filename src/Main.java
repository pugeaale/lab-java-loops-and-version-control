public class Main {
    public static void main(String[] args) {
        int[] arrayTest = { 2 , -2 , 0 , 4};

        System.out.println(getDiffBetweenLargestSmallest(arrayTest));
    }

    /*
   Write a Java method that returns the difference between the largest and smallest values
   in an array of integers.
   The length of the array must be at least 1.
     */
    private static int getDiffBetweenLargestSmallest(int[] array) {
        if( array == null || array.length == 0) {
            return -1;
        }
        int smallest = array[0];
        int largest = smallest;

        for (int i = 1 ; i < array.length ; i++) {
            if( array[i] > largest ) largest = array[i];
            else if (array[i] < smallest) smallest = array[i];
        }
        return largest-smallest;
    }
}