class Solution {
public:
    int subtractProductAndSum(int n) {
        int sum =0,pro=1;
        while(n>0)
        {
            int digi = n%10;
            sum+=digi;
            pro*=digi;
            n/=10;
        }
        return pro-sum;
        
    }
};