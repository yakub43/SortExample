public class Example263 {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIdx = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctIdx]){
                swap(arr, i, correctIdx);
            }
            else{
                i++;
            }
        }
        // search for first missing number
        for (int index = 0; index < arr.length; index++){
            if (arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
