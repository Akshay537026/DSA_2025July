// https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class SearchEleRotatedArr {
    public int search(int[] nums, int target) {
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i])
                index = i;
        }

        return index;
    }
}
