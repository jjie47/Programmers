class Solution {
    public int[] solution(long n) {
        int count = String.valueOf(n).length();
        int[] answer = new int[count];
        for(int i = 0; i<count; i++){
            answer[i] = (int)(n % 10) ;
            n /= 10;
        }
        return answer;
    }
}