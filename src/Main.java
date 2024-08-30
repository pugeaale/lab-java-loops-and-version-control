public class Main {
    public static void main(String[] args) {
        int[] arrayTest = { -1 , -2 , -1 ,0 , 4};

        System.out.println(getDiffBetweenLargestSmallest(arrayTest));
        printSmallestAndSecondSmallest(arrayTest);
        calculate(1,2);
        calculate(0,1);
    }

    /**
     * Get the difference between the largest and smallest values
     * in an array of integers.
     * @param array array of integers
     * @return difference between the largest and smallest value or -1 if array is null
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
    private static void printSmallestAndSecondSmallest(int[] array) {
        try {
            int smallest = array[0];
            int secondSmallest = smallest;

            for (int i = 1 ; i < array.length ; i++) {
                if( array[i] < smallest  ) {
                    secondSmallest = smallest;
                    smallest = array[i];
                }
                else if (array[i] < secondSmallest) secondSmallest = array[i];
            }
            System.out.println("smallest = " + smallest + " - second smallest : " + secondSmallest);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    /*
    Task 3
Write a Java method that calculates the result of the following mathematical expression,
where x and y are two variables that have been pre-set in your code:
x^2 +  ( (4y/5) - x )^2
     */
    private static void calculate(double x , double y) {
        double z = (4*y/5)-x;
        z *= z;
        double xx = x*x;
        double s = z +xx;
        System.out.println("result = " + s);
    }
}