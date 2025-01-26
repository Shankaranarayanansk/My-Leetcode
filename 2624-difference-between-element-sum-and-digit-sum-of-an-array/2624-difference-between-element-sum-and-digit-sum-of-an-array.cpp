class Solution {
public:
    int differenceOfSum(vector<int>& nums) {
        int sum =0;
        int dig =0;
        for(int i=0;i<nums.size();i++)
        {
            sum += nums[i];
            int temp = nums[i];
            while(temp!=0)
            {
                dig+=temp%10;
                temp/=10;

            }
        }
        int ans = abs(sum-dig);
        return ans;
    }
};