class Solution {
public:
    int findNumbers(vector<int>& nums) {
        int count = 0;
        for(int num :nums)
        {
            int digi = 0;
            while(num !=0)
            {
                num/=10;
                digi++;
            }
            if(digi%2==0)
            {
                count++;
            }
        }
        return count;
    }
};