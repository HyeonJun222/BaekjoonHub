import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        // 배열에 2를 앞, 뒤에서 하나씩 찾아서 그 안쪽 다 반환하기!
        int front = -1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 2){
                front = i;
                break;       
            }
        }
        if (front == -1){
            return new int[]{-1};
        }
        
        int back = 0;
        for (int i = arr.length -1; i > -1; i--){
            if (arr[i] == 2){
                back = i;
                break;
            }
        }
        // 배열 담기
        int[] answer = new int[back - front  + 1];
        // arr[fornt] - arr[back]까지 answer에 할당할것
            answer = Arrays.copyOfRange(arr, front, back +1);
   
        return answer;
    }
}