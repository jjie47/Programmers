class Solution {
    public double solution(int[] arr) {
        int sum = 0;
        for(int num : arr){
             sum += num;
        }
        return sum/(arr.length*1.0);
    }
}