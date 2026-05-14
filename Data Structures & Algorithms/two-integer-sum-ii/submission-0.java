class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int start = 0;
        int answers[] = new int[2];
        boolean finished = false;
        while (!finished) {
            for (int i = 0; i < n; i++) {
                if (i == start) {
                continue;
                }
                if (numbers[i] + numbers[start] == target) {
                answers[0] = start + 1;
                answers[1] = i + 1;
                finished = true;
                }
            }
            start++;
        }
        return answers;
    }
    
}
