// Largest palindrome product
//        Problem 4
//        A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
//        Find the largest palindrome made from the product of two 3-digit numbers.

public class Problem4 {
    public static String solve() {
        int largestPalindrome = 0;
        for (int i = 999; i > 99; i--) {

            // if there's no way the product is larger, let's return early
            if (i*999 < largestPalindrome) {
                break;
            }

            for (int j = i; j > 99; j--) {
                int product = i * j;

                // if the product is not larger, let's return early
                if (product < largestPalindrome) {
                    break;
                }

                if (isPalindrome(product)) {
                    largestPalindrome = product;
                    break;
                }
            }
        }

        return "The largest palindrome made from the product of two 3-digit numbers is " + largestPalindrome + ".";
    }

    private static boolean isPalindrome(Integer product) {
        String productString = product.toString();
        int length = product.toString().length();
        int backward = length - 1;
        for (int forward = 0; forward <= Math.floorDiv(length, 2); forward++, backward--) {
            if (productString.charAt(forward) != productString.charAt(backward)) {
                return false;
            }
        }
        return true;
    }
}
