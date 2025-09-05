class Pattern8 {
    public void pattern8(int n) {
        for (int i = 1; i <= n; i++) {
            //print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            //print *
            for (int j = 1; j <= 2 * n - 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}