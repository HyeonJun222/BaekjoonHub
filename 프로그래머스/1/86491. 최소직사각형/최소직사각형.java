// 배열 가로, 세로를 비교해서 큰 값들을 가로에, 작은 값들을 세로에 모으고
// 큰 값들만 뽑아서 곱하기!!!
public class Solution {
    public int solution (int[][] sizes){
        int answer = 1;
        int square_vh = 0;  // 가로
        int square_hi = 0;  // 세로

        for (int i = 0; i < sizes.length; i++) {
            // 가로, 세로 중 큰 값을 가로로 모으고
            int square_long = Math.max(sizes[i][0], sizes[i][1]);
            int square_short = Math.min(sizes[i][0], sizes[i][1]);

            // 가로 길이 중 큰 값
            square_vh = Math.max(square_vh, square_long);

            // 세로 길이 중 큰 값
            square_hi = Math.max(square_hi, square_short);

            // 답 (가장 큰 가로, 세로 곱하기)
            answer = square_vh * square_hi;
        }
        return answer;
    }
}
