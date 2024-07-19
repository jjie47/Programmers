class Solution {
    public int solution(int a, int b) {
        String ab_string = (a+"")+(b+"");
        String ba_string = (b+"")+(a+"");

        int ab_int = Integer.parseInt(ab_string);
        int ba_int = Integer.parseInt(ba_string);

        int answer = ab_int>ba_int ? ab_int : ba_int;
        return answer;
    }
}