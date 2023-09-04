//https://leetcode.com/problems/first-missing-positive/

public class Example41 {
    public static void main(String[] args) {
        int[] arr = {1,2,0};
        System.out.println(firstMissingPositive(arr));
    }
    public static int firstMissingPositive(int[] nums) {
        int i = 0;

        while (i < nums.length){
            int correctIdx = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIdx]){
                swap (nums, i, correctIdx);
            }
            else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++){
            if(nums[j] != j + 1 ){
                return j + 1;
            }
        }
        return nums.length + 1;
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
