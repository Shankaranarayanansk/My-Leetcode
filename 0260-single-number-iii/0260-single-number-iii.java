 class Solution {
  public int[] singleNumber(int[] nums) {
     int xor = Arrays.stream(nums).reduce((a, b) -> a ^ b).getAsInt();
     int lowbit = xor & -xor;
    int[] ans = new int[2];
    for ( int num : nums)
      if ((num & lowbit) > 0)
        ans[0] ^= num;
      else
        ans[1] ^=num;
          return ans ;

  }
}


