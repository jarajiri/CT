class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if(arr1.length> arr2.length) return 1;
        else if (arr1.length == arr2.length){
            if(sum(arr1)>sum(arr2)) return 1;
            else if(sum(arr1)==sum(arr2)) return 0;
            else return -1;
        }
        else return -1;
    }
    static int sum(int[] arr){
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}