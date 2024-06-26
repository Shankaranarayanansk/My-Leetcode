class Solution {
   public int getXORSum(int[] a, int[] b) {
    int res = 0, c = 0;
    for (var n : a)
        c ^= n;
    for (var n : b)
        res = res ^ (c & n);
    return res;
}
}

