import java.util.Arrays;
class CheckDuplicate {
    public boolean containsDuplicate(int[] nums) {
        boolean isDuplicate = false;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                isDuplicate = true;
                break;
            }
        }
        return isDuplicate;
    }
}


// Recommend solution

// public class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         long bitmask = 0L;  // 64-bit mask

//         for (int num : nums) {
//             if (num < 0 || num > 63) {
//                 throw new IllegalArgumentException("Number out of range for bitmasking.");
//             }

//             long bit = 1L << num;
//             if ((bitmask & bit) != 0) {
//                 return true;  // duplicate found
//             }
//             bitmask |= bit;  // mark the number as seen
//         }

//         return false;
//     }
// }
