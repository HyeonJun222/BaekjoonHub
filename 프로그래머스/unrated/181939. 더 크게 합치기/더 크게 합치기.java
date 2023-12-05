class Solution {
    public int solution(int a, int b) {
        String ab = String.valueOf(Integer.valueOf(a)+String.valueOf(b));
        String ba = String.valueOf(Integer.valueOf(b)+String.valueOf(a));

        int aPlusb = Integer.parseInt(ab);
        int bPlusa = Integer.parseInt(ba);

        if (aPlusb >= bPlusa) return aPlusb;
        else return bPlusa;
    }
}