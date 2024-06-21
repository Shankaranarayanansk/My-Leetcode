class Solution {
    public int countEven(int num) {
        int b = 0;
        for (int i = 1; i <= num; i++) {
            int c = fun(i);
            if (c % 2 == 0) {
                b++;
            }
        }
        return b;
    }
    
    public int fun(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
