// 10001st prime
//        Problem 7
//        By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
//        What is the 10 001st prime number?

public class Problem7 {
    public static String solve() {
        int primeNumber = 1;

        for (int count = 0; count < 10001; count++) {
            primeNumber++;
            while (!isPrime(primeNumber)) {
                primeNumber++;
            }
        }

        return "The 10 001st prime number is " + primeNumber + ".";
    }

    private static boolean isPrime(long number) {
        for (long factor = 2, end = (long) Math.sqrt(number); factor <= end; factor++) {
            if (number % factor == 0) {
                return false;
            }
        }
        return true;
    }
}
