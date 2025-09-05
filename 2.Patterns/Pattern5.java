class Pattern5 {
    public void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {//j = n - i + 1
                System.out.print("*");
            }
            System.out.println();
        }
    }
}