package dsa.Recursion;

public class IsPalindrome {
    public static boolean isPalindrome(String str) {
        return checkString(0, str);
    }

    public static boolean checkString(int index , String s){
        if(index >= s.length()) return true;
        if(s.charAt(index) != s.charAt(s.length() - index - 1)) return false;
        return checkString(index + 1, s);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("nikhil"));
    }
}
