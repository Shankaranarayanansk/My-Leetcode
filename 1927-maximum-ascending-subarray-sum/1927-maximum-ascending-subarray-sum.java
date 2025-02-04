class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = nums[0];
        int cur = nums[0];
        for(int i=1;i<=nums.length-1;i++)
        {
            if(nums[i-1]<nums[i])
            {
                cur +=  nums[i];
            }
            else
            {
                max = Math.max(max,cur);
                cur = nums[i];
            }
        }
        max = Math.max(max,cur);
        return cur;
    }
}