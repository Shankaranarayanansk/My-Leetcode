class Solution {
public:
    bool isSameAfterReversals(int num) {
        int ori = num;
        int rev = 0;
        int rev2 = 0;
        while(num!=0)
        {
            rev = rev*10 + num%10;
            num = num/10;
        }
        while(rev!=0)
        {
           rev2 = rev2*10 + rev%10;
           rev = rev/10; 
        }
         return rev2 == ori;

    }
};