class Solution {
    public int solution(int a, int b) {
        String abString = ""+a+b;
        int abString_int = Integer.parseInt(abString);
        int abInt = 2*a*b;
            
        int answer = abString_int >= abInt ? abString_int : abInt;
        return answer;
    }
}