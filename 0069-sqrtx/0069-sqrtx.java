class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x; // Return immediately for 0 and 1
        }

        int low = 0;
        int high = x;
        int result = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if mid * mid equals x, avoiding overflow by casting to long
            if ((long) mid * mid == x) {
                return mid;
            } 
            // If mid * mid is less than x, discard left half
            else if ((long) mid * mid < x) {
                low = mid + 1;
                result = mid; // Store potential result
            } 
            // If mid * mid is greater than x, discard right half
            else {
                high = mid - 1;
            }
        }

        return result;
    }
}
