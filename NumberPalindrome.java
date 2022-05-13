public class NumberPalindrome {
    
     public static boolean isPalindrome(int number) {
 
        int result = number;
        int reverse = 0;
        while (result != 0 ) {
            int lastDigit = result % 10;
            reverse = (reverse * 10) + lastDigit;
            result /= 10;
        }
        return number == reverse;
    }
}
