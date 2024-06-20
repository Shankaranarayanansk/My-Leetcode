class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> ma = new HashMap();
        for(int i= 0 ;i < nums.length;i++)
        {
            int com = target - nums[i];
            if(ma.containsKey(com))
            
                return new int[]{ma.get(com),i};
                ma.put(nums[i],i);
            
           
        }
        return null ;
    }
}