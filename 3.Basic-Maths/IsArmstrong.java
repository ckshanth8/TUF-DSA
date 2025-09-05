class IsArmstrong {
    public boolean isArmstrong(int n) {
        int length = String.valueOf(n).length();
        int original = n, ans = 0, rem = 0;
        while (n > 0) {
            rem = n % 10;
            ans = ans + (int) Math.pow(rem, length);
            n /= 10;
        }
        return original == ans;
    }
}