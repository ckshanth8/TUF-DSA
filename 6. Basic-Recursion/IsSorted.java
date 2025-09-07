import java.util.ArrayList;

class IsSorted {
    public boolean isSorted(ArrayList<Integer> nums) {
        // your code goes here
        int n = nums.size();
        if (n <= 1) return true;
        return isSorted(nums, 0, n);
    }

    public boolean isSorted(ArrayList<Integer> nums, int i, int n) {
        if (i >= n) return true;
        if (i + 1 < n && nums.get(i) > nums.get(i + 1)) return false;
        return isSorted(nums, i + 1, n);
    }
}
