 class Solution {
    public String reverseVowels(String s) {
        int a = s.length();
        char c[] = s.toCharArray();
        int start = 0;
        int end = a - 1;
        
        while (start < end) {
            if (!isVowel(c[start])) {
                start++;
            } else if (!isVowel(c[end])) {
                end--;
            } else {
                c[start]=(char)( c[start]^ c[end]);
                c[end] = (char)(c[start]^ c[end]);
                c[start]=(char)(c[start]^ c[end]);
                start++;
                end--;
               
            }
        }
        
        return String.valueOf(c);
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}

        
