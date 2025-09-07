import java.util.ArrayList;
import java.util.Collections;

class Leaders {
    // Function to find the leaders in an array.
    public ArrayList<Integer> leaders(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (nums.length == 0) {
            return ans;
        }

        // Last element of the array is always a leader
        int rightMax = nums[nums.length - 1];
        ans.add(nums[nums.length - 1]);

        // Check elements from right to left
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > rightMax) {
                ans.add(nums[i]);
                rightMax = nums[i];
            }
        }
        
        /* Reverse the list to match
        the required output order */
        Collections.reverse(ans);

        // Return the leaders
        return ans;
    }
}