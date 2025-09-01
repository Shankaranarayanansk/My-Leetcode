class Solution {
    public int heightChecker(int[] heights) {
        int count = heights.length;
        int arr [] = heights.clone();
        Arrays.sort(arr);
        for(int i = 0;i<=heights.length-1;i++)
        {
            if(heights[i]==arr[i])
            {
                count--;
            }
        }
        return count;
    }
}