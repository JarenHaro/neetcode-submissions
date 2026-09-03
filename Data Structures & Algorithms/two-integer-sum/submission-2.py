class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        answer = []
        
        for i in range(0, len(nums)):
            for j in range(0, len(nums)):
                if j == i:
                    continue
                else:
                    if nums[j] + nums[i] == target and answer.count(i) == 0 and answer.count(j) == 0:
                        answer.append(i)
                        answer.append(j)
        return answer  
