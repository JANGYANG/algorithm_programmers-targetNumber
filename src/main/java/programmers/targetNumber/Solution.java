package programmers.targetNumber;
class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = find(numbers, 0, target);
        return answer;
    }
    public int find(int[] numbers, int index, int target){
        int result = 0;
        if(index < numbers.length){
            result += find(numbers, index+1, target - numbers[index]);
            result += find(numbers, index+1, target + numbers[index]);
        }else{
            result = (target == 0)? 1:0;
        }
        return result;
    }
}