class Solution {
    public void sortColors(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) 
        {
            int small = i;
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[j] < arr[small]) {
                    small = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[small];
            arr[small] = temp;
        }
        for (int k : arr) {
            System.out.print(k);
        }
    }
}