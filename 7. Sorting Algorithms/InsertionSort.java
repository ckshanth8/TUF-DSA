class InsertionSort {
    public int[] insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int currentElement = nums[i];
            int j = i - 1;
            // Shift elements greater than key to the right
            while (j >= 0 && nums[j] > currentElement) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = currentElement;
        }
        return nums;
    }
}
