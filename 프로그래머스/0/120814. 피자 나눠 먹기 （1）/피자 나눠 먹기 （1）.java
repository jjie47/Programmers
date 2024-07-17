class Solution {
    public int solution(int n) {
        int answer = n/7;
        int div = n%7;
        if(div>0){
            answer++;
        }
        return answer;
    }
}