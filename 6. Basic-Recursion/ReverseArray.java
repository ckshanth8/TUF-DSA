class ReverseArray {
    public int[] reverseArray(int[] nums) {
        // your code goes here
        int n = nums.length;
        if (n <= 1) return nums;
        reverseArray(nums, 0, n - 1);
        return nums;
    }

    public void reverseArray(int[] nums, int left, int right) {
        if (left >= right) return;
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        reverseArray(nums, left + 1, right - 1);
    }
}
