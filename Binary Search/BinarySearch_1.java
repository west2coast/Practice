
/**
 * @author west2coast
 *
 */

public class BinarySearch_1 {

    public static void main(String[] args) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
		41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int result = doSearch(primes, 73);
        System.out.println("Found prime at index " + result);
    }

    public static int doSearch(int[] array, int targetValue){
        int min = 0;
        int max = array.length - 1;

        while (max >= min){
          int guess = (min + max) / 2;
          if (targetValue == array[guess]){
            return guess;
          }else if (array[guess] < target){
             min = guess + 1;
          }else{
            max = guess - 1;
          }
        }

        return -1;
    }

}
