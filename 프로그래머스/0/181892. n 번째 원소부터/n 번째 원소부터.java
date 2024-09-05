class Solution {
    public int[] solution(int[] num_list, int n) {
        int count = num_list.length-n+1;
        int[] answer = new int[count];
        for(int i=0; i<count; i++){
            answer[i] += num_list[n-1];
            n++;
        }
        return answer;
    }
}