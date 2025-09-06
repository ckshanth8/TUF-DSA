import java.util.*;

class UnionArray {
    public int[] unionArray(int[] nums1, int[] nums2) {
        int index1 = 0, index2 = 0;
        List<Integer> result = new ArrayList<>();

        // Traverse both arrays until one is exhausted
        while (index1 < nums1.length && index2 < nums2.length) {
            int num1 = nums1[index1];
            int num2 = nums2[index2];

            if (num1 == num2) {
                // Add only one instance of the duplicate value
                // This ensures the union contains unique elements
                addIfNew(result, num1);
                index1++;
                index2++;
            } else if (num1 < num2) {
                addIfNew(result, num1);
                index1++;
            } else {
                addIfNew(result, num2);
                index2++;
            }
        }

        // Add any remaining elements from nums1
        while (index1 < nums1.length) {
            addIfNew(result, nums1[index1++]);
        }

        // Add any remaining elements from nums2
        while (index2 < nums2.length) {
            addIfNew(result, nums2[index2++]);
        }

        // Convert List<Integer> to int[] and return
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    // Helper method to avoid adding duplicate values
    private void addIfNew(List<Integer> list, int value) {
        if (list.isEmpty() || list.get(list.size() - 1) != value) {
            list.add(value);
        }
    }
}
