class Solution {
    public int differenceOfSums(int n, int m) {
                int sum = (1 + n) * n / 2 - (1 + n / m) * (n / m) * m;
                return sum;

    }
}

    