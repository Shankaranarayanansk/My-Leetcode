class Solution {
    public String toLowerCase(String s) {
         char[] a = s.toCharArray();
        IntStream.range(0, a.length).filter(i -> 'A' <= a[i] && a[i] <= 'Z').forEach(i -> a[i] = (char) (a[i] - 'A' + 'a'));
        return new String(a);
    }
}