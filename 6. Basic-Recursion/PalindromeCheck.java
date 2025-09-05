class PalindromeCheck {
    public boolean palindromeCheck(String s) {
        // your code goes here
        int n = s.length();
        if (n == 1) return true;
        return isPalindrome(s, 0, n - 1);
    }

    public boolean isPalindrome(String s, int left, int right) {
        if (s.charAt(left) != s.charAt(right)) return false;
        if (left >= right) return true;
        return isPalindrome(s, left + 1, right - 1);
    }
}
