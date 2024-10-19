class Solution {
    public int solution(int[] num_list) {
        int multiply = 1;
        int plus = 0;
        for(int num : num_list){
            multiply *= num; 
        }
        for(int num : num_list){
            plus += num; 
        }
        plus *= plus;
        
        return multiply<plus ? 1 : 0;
    }
}