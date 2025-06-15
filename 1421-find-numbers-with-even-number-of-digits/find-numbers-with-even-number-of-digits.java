class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int i=0;i<=nums.length-1;i++)
        {
           if(digits(nums[i])%2==0)
           {
             ans++;
           }
        }
        return ans ;
    }
    public int digits (int num)
    {
        // int n = 0;
        // while(num!=0)
        // {
        //     num/=10;
        //     n++;
        // }
        return (int)(Math.log10(num))+1;
    }
}