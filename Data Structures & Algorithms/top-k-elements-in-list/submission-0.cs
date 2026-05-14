
public class Solution {
    public int[] TopKFrequent(int[] nums, int k) {
        int[] uniqueElements = nums.Distinct().ToArray();
        Dictionary<int,int> freqMap = new Dictionary<int,int>();
        for (int i = 0; i < uniqueElements.Length; i++) {
            int count = 0;
            for (int j = 0; j < nums.Length; j++) {
                if (nums[j] == uniqueElements[i]) {
                    count++;
                }
            }
            freqMap.Add(uniqueElements[i], count);
        }
        var heap = new PriorityQueue<int,int>();
        foreach (var p in freqMap) {
            heap.Enqueue(p.Key, p.Value);
            if (heap.Count > k) {
                heap.Dequeue();
            }
        }

        var result = new List<int>();
        while (heap.Count > 0)
        {
            result.Add(heap.Dequeue());
        }
        return result.ToArray();
    }
}