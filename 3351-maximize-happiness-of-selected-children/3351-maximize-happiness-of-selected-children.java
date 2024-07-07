class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int  Size = happiness.length;
          Integer[] happinessArray = new Integer[ Size];
        for(int i = 0; i < Size; i++) {
            happinessArray[i] = happiness[i];
        } 
        Arrays.sort(happinessArray, Collections.reverseOrder()); 
        long totalHappinessSum = 0;
        int turns = 0; 
        for(int i = 0; i < k; i++) { 
            totalHappinessSum += Math.max(happinessArray[i] - turns, 0); 
            turns++; 
        }
        
        return totalHappinessSum;
    }
}