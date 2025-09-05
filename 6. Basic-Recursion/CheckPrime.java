class CheckPrime {
    public boolean checkPrime(int num) {
        // your code goes here
        if (num <= 1) return false;
        return prime(num, 2);
    }

    public boolean prime(int num, int x) {
        if (x > Math.sqrt(num)) return true;
        if (num % x == 0) return false;
        return prime(num, x + 1);
    }
}
