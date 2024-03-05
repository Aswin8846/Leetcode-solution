import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Create a map to store the frequency of each number
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        // Create a priority queue to store elements based on their frequency
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue()); // Max heap based on frequency
        
        // Add all entries from the map to the priority queue
        pq.addAll(freqMap.entrySet());
        
        // Extract top k frequent elements from the priority queue
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll().getKey();
        }
        
        return result;
    }
}
