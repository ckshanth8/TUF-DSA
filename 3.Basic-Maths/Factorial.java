class Factorial {
    public int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
        // if(n==0 || n==1) return 1;
        // return n*factorial(n-1);
    }
}