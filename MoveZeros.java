import java.util.Arrays;
public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int k;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                continue;

            k = i;
            while (nums[k] == 0 && k < nums.length - 1) { // 0 1 0 3 12 1 0 0 3 12
                k++; // 1 3 0 0 12 1 3 12 0 0
            }

            nums[i] = nums[k];
            nums[k] = 0;

            if (k == nums.length - 1)
                break;
        }

    }
}


//Better solution - TC is same but logic is good

    // public void moveZeroes(int[] nums) {
    //     int k=0;

    //     for(int i=0; i<nums.length; i++) {
    //         if(nums[i]!=0) {
    //             nums[k]=nums[i];
    //             k++;
    //         }
    //     }

    //     for(int i=k; k<nums.length; k++) {
    //         nums[k]=0;
    //     }
    // } 

