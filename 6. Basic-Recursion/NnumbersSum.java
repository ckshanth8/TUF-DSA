class NnumbersSum {
    public int NnumbersSum(int n) {
        //your code goes here
        if (n == 1) return 1;
        return n + NnumbersSum(n - 1);
    }
}