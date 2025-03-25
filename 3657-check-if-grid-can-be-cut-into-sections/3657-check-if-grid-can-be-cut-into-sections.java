class Solution {
  public boolean checkValidCuts(int n, int[][] r) {
    int[][] x = new int[r.length][2], y = new int[r.length][2];

    for (int i = 0; i < r.length; ++i) {
      x[i][0] = r[i][0];
      x[i][1] = r[i][2];
      y[i][0] = r[i][1];
      y[i][1] = r[i][3];
    }

    return Math.max(count(x), count(y)) >= 3;
  }

  private int count(int[][] iv) {
    int c = 0, pe = 0;

    Arrays.sort(iv, (a, b) -> Integer.compare(a[0], b[0]));

    for (int[] i : iv) {
      if (i[0] < pe) pe = Math.max(pe, i[1]);
      else { pe = i[1]; ++c; }
    }

    return c;
  }
}