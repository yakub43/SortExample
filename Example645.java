import java.util.Arrays;
// https://leetcode.com/problems/set-mismatch/
public class Example645 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        findErrorNums(nums);
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    public static int[] findErrorNums(int[] nums){
        int i = 0;

        while (i < nums.length){
            int correctIdx = nums[i] - 1;
            if (nums[i] != nums[correctIdx]){
                swap(nums, i,correctIdx);
            }
            else {
                i++;
            }
        }
        int[] ans = {-1,-1};

        for (int j = 0; j < nums.length; j++){
            if (nums[j] != j + 1){
                ans[0] = nums[j];
                ans[1] = j + 1;
            }
        }
        return ans;
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
