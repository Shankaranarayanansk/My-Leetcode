class Solution {
public:
    bool isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) 
            return false;
        
        int rev = 0, ori = x;

        while (x != 0) {
            int a = x % 10;
            if(rev>INT_MAX/10)
            return false;
            rev = rev * 10 + a;
            x /= 10;
        }

        return rev == ori;
    }
};
