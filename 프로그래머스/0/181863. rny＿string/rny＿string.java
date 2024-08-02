class Solution {
    public String solution(String rny_string) {
        String answer = "";
        for(int i = 0; i<rny_string.length(); i++){
            if(rny_string.charAt(i)==109){
                answer += "rn";
            }
            else{
                answer += rny_string.charAt(i);
            }
        }
        return answer;
    }
}