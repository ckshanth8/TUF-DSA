class IsPalindrome {
    public boolean isPalindrome(int n) {
        int original = n, rev = 0, digit = 0;
        while (n > 0) {
            digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return original == rev;
    }
}
