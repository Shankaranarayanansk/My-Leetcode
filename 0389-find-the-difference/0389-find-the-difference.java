class Solution {
    public char findTheDifference(String s, String t) {
        int str1 = 0;
        int str2 = 0;
        for(int i=0;i<s.length();i++)
        {
            str1 = str1 + s.charAt(i);
        }
        for(int i=0;i<t.length();i++)
        {
            str2+=t.charAt(i);
        }
        char ans = (char)(str2 - str1);
        return ans;
    }
}