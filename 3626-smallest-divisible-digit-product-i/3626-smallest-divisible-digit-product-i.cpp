class Solution {
public:
    int calculate(int n) {
        int pro = 1;
        while (n > 0) {
            int a = n % 10;
            if (a == 0) {
                return 0;
            }
            pro *= a;
            n /= 10;
        }
        return pro;
    }

public:
    int smallestNumber(int n, int t) {
        while (true) {
            int product = calculate(n);
            if (product % t == 0) {
                return n;
            }
            n++;
        }
    }
};