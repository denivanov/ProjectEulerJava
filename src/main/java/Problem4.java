// Largest prime factor
//        Problem 3
//        The prime factors of 13195 are 5, 7, 13 and 29.
//
//        What is the largest prime factor of the number 600851475143 ?

public class Problem4 {
    public static String solve() {
        long number = 600851475143L;
        long largestPrimeFactor = divideBySmallestPrimeFactor(number);

        return "The largest prime factor of the number 600851475143 is " + largestPrimeFactor + ".";
    }

    // recursively divides by the smallest prime factor until the input param is a prime
    private static long divideBySmallestPrimeFactor(long number) {
        for (long factor = 2, end = (long) Math.sqrt(number); factor <= end; factor++) {
            if (number % factor == 0) {
                return divideBySmallestPrimeFactor(number / factor);
            }
        }
        return number;
    }
}
