class IsPerfect {
    public boolean isPerfect(int n) {
        //Brute force with TC - O(n)
        // int sum = 0;
        // for (int i = 1; i < n; i++) {
        //   if (n % i == 0) {
        //     sum += i;
        //   }
        // }
        // return sum == n;

        // Optimal with TC - O(sqrt(n))
        int sum = 0;
        if (n == 1) return false;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
        /* Add the counterpart divisor
                if it's different from i and
                if it is not n itself */
                if (n / i != n && i != n / i) {
                    sum += (n / i);
                }
            }
        }
        return sum == n;
    }
}
