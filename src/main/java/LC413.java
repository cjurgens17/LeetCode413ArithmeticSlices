public class LC413 {

    public static void main(String[] args) {
        System.out.println(numberOfArithemeticSlice(new int[] {1,2,3,4}));
        System.out.println(numberOfArithemeticSlice(new int[] {1}));
        System.out.println(numberOfArithemeticSlice(new int[] {1,2,3,8,9,10}));

    }
    //An integer array is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.
    //
    //For example, [1,3,5,7,9], [7,7,7,7], and [3,-1,-5,-9] are arithmetic sequences.
    //Given an integer array nums, return the number of arithmetic subarrays of nums.
    //
    //A subarray is a contiguous subsequence of the array.
    //
    //
    //
    //Example 1:
    //
    //Input: nums = [1,2,3,4]
    //Output: 3
    //Explanation: We have 3 arithmetic slices in nums: [1, 2, 3], [2, 3, 4] and [1,2,3,4] itself.
    //Example 2:
    //
    //Input: nums = [1]
    //Output: 0
    //
    //
    //Constraints:
    //
    //1 <= nums.length <= 5000
    //-1000 <= nums[i] <= 1000

    public static int numberOfArithemeticSlice(int[] nums){
        if(nums == null || nums.length < 3) return 0;

        int num = 2;
        int count = 0;
        int slice = nums[1] -nums[0];
        int check = slice;

        for(int i = 2;i<nums.length;i++){
            slice = nums[i] - nums[i-1];

            if(check == slice) num++;

            if(check != slice){
                if(num > 2) count += (num-1)*(num-2)/2;
                num = 2;
                check = slice;
            }
        }
        if(num > 2) count += (num-1)*(num-2)/2;
        return count;
    }
}
