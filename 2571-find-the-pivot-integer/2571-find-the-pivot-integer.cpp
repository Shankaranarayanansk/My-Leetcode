class Solution {
public:
    int pivotInteger(int n) {
        int ans = n*(n+1) / 2;
        double a = sqrt(ans);
        return(a==ceil(a))?a:-1;
    
    }
};