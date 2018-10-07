// Smallest multiple
//        Problem 5
//        2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//
//        What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

public class Problem5 {
    public static String solve() {
        int smallestNumber = 0;

        while (true) {
            boolean divisible = true;
            smallestNumber+=2520;
            for (int i = 20; i > 0; i--) {
                if (smallestNumber % i != 0) {
                    divisible = false;
                    break;
                }
            }
            if (divisible) {
                break;
            }
        }

        return "The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is " + smallestNumber + ".";
    }
}
