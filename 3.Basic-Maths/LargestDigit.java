class LargestDigit {
    public int largestDigit(int n) {
        int largestDigit = 0;
        int digit = 0;
        while (n > 0) {
            digit = n % 10;
            if (digit >= largestDigit) {
                largestDigit = digit;
            }
            n /= 10;
        }
        return largestDigit;
    }
}