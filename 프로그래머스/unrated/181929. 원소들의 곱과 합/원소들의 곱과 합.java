class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int sum = 0;
        int multiple = 1;
        for (int i = 0; i < num_list.length; i++){
            sum += num_list[i];
            multiple *= num_list[i];
        }
        if (sum * sum > multiple) return answer = 1;
            
        return answer;
    }
}