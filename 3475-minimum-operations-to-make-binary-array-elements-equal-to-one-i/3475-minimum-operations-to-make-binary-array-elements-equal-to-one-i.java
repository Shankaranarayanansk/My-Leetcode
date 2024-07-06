class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = i + 2;
            if (nums[i] == 0) {
                nums[i] = 1;
                nums[j] = nums[j] ^ 1;
                nums[k] = nums[k] ^ 1;
                count++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            int k = nums[i] ^ 1;
            if (k == 1) {
                return -1;
            }
        }
        return count;

    }
}