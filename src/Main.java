public class Main {
    public static void main(String[] args) {
        int[] arrayTest = { -1 , -2 , -1 ,0 , 4};

        System.out.println(getDiffBetweenLargestSmallest(arrayTest));
        printTwoSmallests(arrayTest);
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

    /*
Task 2
Write a Java method that finds the smallest and second smallest elements of a given array
and prints them to the console.
 */
    private static void printTwoSmallests(int[] array) {
        try {
            int smallest = array[0];
            int secondSecond = smallest;

            for (int i = 1 ; i < array.length ; i++) {
                if( array[i] < smallest  ) {
                    secondSecond = smallest;
                    smallest = array[i];
                }
                else if (array[i] < secondSecond) secondSecond = array[i];
            }
            System.out.println("smallest = " + smallest + " - second smallest : " + secondSecond);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}