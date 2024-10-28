class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long abs = Math.abs(a-b);
        
        for(int i = 0; i<abs+1; i++){
            answer += a;
            a += (a < b) ? 1 : -1;
        }
        return answer;
    }
}