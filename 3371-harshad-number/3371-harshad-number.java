class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int res = x;
        while(x!=0)
        {
            int n =x%10;
            sum+=n;
            x/=10;
        }
        if(res%sum==0)
        {
            return sum;
        }
        else
        {
            return -1;
        }
    }
}