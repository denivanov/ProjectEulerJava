// Multiples of 3 and 5
//        Problem 1
//        If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//
//        Find the sum of all the multiples of 3 or 5 below 1000.

public class Problem1 {
    public static String solve() {
        int sum = 0;

        for (int multiple = 0; multiple < 1000; multiple++) {
            if (multiple % 3 == 0 || multiple % 5 == 0) {
                sum += multiple;
            }
        }

        return "The sum of all the multiples of 3 or 5 below 1000 is " + sum + ".";
    }
}
