class CountOddDigit {
    public int countOddDigit(int n) {
        int count = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 != 0) {
                count++;
            }
            n /= 10;
        }
        return count;
    }
}
