class Solution {
    public int countDays(int days, int[][] meetings) {
       Arrays.sort(meetings, Comparator.comparingInt(a -> a[0])); 

        int busyDays = 0, prevEnd = 0;
        for (int[] meeting : meetings) {
            int start = Math.max(meeting[0], prevEnd + 1);
            int end = meeting[1];
            
            if (start <= end) { 
                busyDays += (end - start + 1);
                prevEnd = end;
            }
        }

        return days - busyDays; 

    }
}