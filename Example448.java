import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
public class Example448 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        //findDisapperedNumbers(nums);
        System.out.println(findDisapperedNumbers(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static List<Integer> findDisapperedNumbers(int[] arr){
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while (i < arr.length){
            int correctIdx = arr[i] - 1;
            if(arr[i] != arr[correctIdx]){
                swap(arr, i, correctIdx);
            }
            else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++){
            if(j != arr[j] - 1){
                ans.add(j+1);
            }
        }
        return ans;
    }
    public static void swap (int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
