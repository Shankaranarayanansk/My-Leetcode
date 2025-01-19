class Solution {
public:
    int findGCD(vector<int>& nums) {
    int min = nums[0];
    int max = nums[0];
    int n = nums.size();
    for(int i=0;i<=n -1;i++)
    {
        if(nums[i]>max)
         max = nums[i];
        if(nums[i]<min)
         min = nums[i];
    }   
    while(min!=0)
    {
        int temp = min;
        min = max%min;
        max = temp;
    }
    return max;
    }
};