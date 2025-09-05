class AddDigits {

    // Method to compute the sum of digits of given number
    public int addDigits(int num) {
        // Base case: if the number is a single digit, return it
        if (num < 10) {
            return num;
        }

        // Recursive case: sum the digits and continue
        int sum = sumDigits(num);

        return addDigits(sum);
    }

    // Helper function to add the sum of digits recursively
    private int sumDigits(int num) {
        // Base case: If the number is 0, return 0
        if (num == 0) return 0;

        // Recursive case
        return sumDigits(num / 10) + (num % 10);
    }
}
