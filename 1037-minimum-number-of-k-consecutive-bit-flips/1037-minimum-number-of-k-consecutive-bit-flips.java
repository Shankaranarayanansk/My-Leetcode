class Solution {
   public int minKBitFlips(int[] nums, int K) {
        int n = nums.length, flip = 0, res = 0;
        int[] isFlip  = new int[n];
        for (int i = 0; i < nums.length; ++i) {
            if (i >= K)
                flip ^= isFlip [i - K];
            if (flip   == nums[i]) {
                if (i + K > nums.length)
                    return -1;
                isFlip [i] = 1;
                flip  ^= 1;
                res++;
            }
        }
        return res;
    }
}