class Solution {
    public int lengthOfLastWord(String s) {
        String [] a = s.split(" ");
        for(int i = a.length-1;i>=0;i--)
        {
            if(!a[i].isEmpty())
            {
               return a[i].length();
            
            }
        }
        return 0;
    }
}