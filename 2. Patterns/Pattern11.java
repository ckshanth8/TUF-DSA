class Pattern11 {
    public void pattern11(int n) {
        // First row starts by printing a single 1.
        int start = 1;
        for (int row = 1; row <= n; row++) {
            if (row % 2 == 0) start = 0;
            else start = 1;
            for (int column = 1; column <= row; column++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            // Move to the next row and give a line break
            System.out.println();
        }
    }
}