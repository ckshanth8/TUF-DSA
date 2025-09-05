class Pattern17 {
    // Function to print pattern17
    public void pattern17(int n) {
        // Outer loop for the number of rows.
        for (int i = 1; i <= n; i++) {

            // Printing spaces before characters.
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Printing characters.
            char ch = 'A';
            int breakpoint = i;
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(ch);
                if (j < breakpoint)
                    ch++;
                else
                    ch--;
            }

            // Move to the next line for the next row.
            System.out.println();
        }
    }
}