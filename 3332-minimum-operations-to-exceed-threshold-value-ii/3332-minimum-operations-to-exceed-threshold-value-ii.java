class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        for (int num : nums) minHeap.add((long) num);
        int numOperations = 0;
        
        while (minHeap.peek() < k) {
            long x = minHeap.poll();
            long y = minHeap.poll();
            minHeap.add(x * 2 + y);
            numOperations++;
        }
        return numOperations;
    }
}