class Solution {
    public void sortColors(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            int min = i;
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temo = arr[i];
            arr[i] = arr[min];
            arr[min] = temo;
        }
        for (int le : arr) {
            System.out.print(le);
        }
    }
}