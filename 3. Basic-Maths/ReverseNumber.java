class ReverseNumber {
    public int reverseNumber(int n) {
        // 123
        // int digit = 123 % 10 = 3
        // int rev = 0;
        // rev = rev * 10 + digit = 0 + 3 = 3
        // rev = 3 * 10 + 2= 32
        // rev = 32 * 10 + 1= 321

        int rev = 0, digit = 0;
        while (n > 0) {
            digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return rev;
    }
}
