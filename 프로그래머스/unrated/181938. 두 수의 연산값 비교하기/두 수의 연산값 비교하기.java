class Solution {
    public int solution(int a, int b) {
        String stringA = String.valueOf(a);
        String stringB = String.valueOf(b);
        String sum = stringA + stringB;

        int ab = Integer.parseInt(sum);

        return Math.max(ab, 2 * a * b);
    }
}