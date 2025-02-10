class Solution {
    public String clearDigits(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                if (str.length() > 0) {
                    str.deleteCharAt(str.length() - 1);
            }
                } else {
                    str.append(ch);
                }
        }
        return str.toString();
    }
}