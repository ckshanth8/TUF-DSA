class MissingNumber {
    public int missingNumber(int[] nums) {
        int i = 0;
        // cyclic sort
        while (i < nums.length) {
            int current = nums[i]; // current = correct index
            if (current < nums.length && nums[i] != nums[current]) {
                // Swap nums[i] with nums[current]
                int temp = nums[i];
                nums[i] = nums[current];
                nums[current] = temp;
            } else {
                i++;
            }
        }
        // After placement, find the missing number
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) return j;
        }
        return nums.length;
    }
}
