class Pattern12 {
    public void pattern12(int n) {
        for (int row = 1; row <= n; row++) {
            //print 1st erectPyramid
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            //print spaces
            for (int col = 1; col <= 2 * n - 2 * row; col++) {
                System.out.print(" ");
            }
            //print 2nd invertedPyramid
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}