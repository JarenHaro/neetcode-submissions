class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int num1 = 0;
        int goal;
        while (num1 < nums.length) {
            goal = target - nums[num1];
            for (int i = 0; i < nums.length; i++) {
                if (num1 == i) {
                    i++;
                }
                if (nums[i] == goal) {
                    if (i < num1) {
                        ans[0] = i;
                        ans[1] = num1;
                        return ans;
                    }
                    else {
                    ans[0] = num1;
                    ans[1] = i;
                    return ans;
                    }
                }
                
            }
            num1++;
        }
        return nums;
    }
}
