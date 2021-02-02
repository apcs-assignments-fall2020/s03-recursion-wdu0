public class MyMain {
    // This method adds up the values of all digits
    // in x, recursively
    public static int addDigits(int x) {
        if (x<10) {
            return x;
        }
        else {
            return x%10 + addDigits(x/10);
        }
    }


    // This method checks if a String is a palindrome
    // (e.g. "racecar", "madam"), recursively
    public static boolean isPalindrome(String str) { 
        if (str.length() < 2) {
            return true;
        } else if (!(str.charAt(0) == str.charAt(str.length()-1))) {
            return false;
        } else {
            str = str.substring(1, str.length()-1);
            return isPalindrome(str);
        }
    }

    // This method returns the orignal string reversed;
    // this method should be written using recursion
    public static String reverse(String str) { 
        if (str.length() < 2) {
            return str;
        } else {
            return str.charAt(str.length()-1) + reverse(str.substring(1, str.length()-1)) + str.charAt(0);
        }
    }

    public static void main(String[] args) {
        int t1 = 9961;
        String t2 = "madam";
        String t3 = "lemon";
        System.out.println(addDigits(t1));
        System.out.println(isPalindrome(t2));
        System.out.println(reverse(t3));
    }
}
