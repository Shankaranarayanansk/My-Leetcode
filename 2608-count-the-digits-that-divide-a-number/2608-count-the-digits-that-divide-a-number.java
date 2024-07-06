class Solution {
    public int countDigits(int num) {
        String str = Integer.toString(num);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            int digit = Character.getNumericValue(str.charAt(i));
            if (num % digit == 0) {
                count++;
            }
        }
        return count;
    }
}
