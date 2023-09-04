import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class Example442 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicates(arr));

    }
    public static List<Integer> findDuplicates(int[] arr){
        List<Integer> ans = new ArrayList<>();
        int i = 0;

        while (i < arr.length){
            int correctIdx = arr[i] - 1;
            if (arr[i] != arr[correctIdx]){
                swap(arr, i, correctIdx);
            }
            else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++){
            if (arr[j] != j+1){
                ans.add(arr[j]);
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
