class Solution {
public:
    vector<int> selfDividingNumbers(int left, int right) {
        vector<int> arr;
        for (int n = left; n <= right; n++) {
            int i = n;
            bool self = true;
            while (i != 0) {
                int a = i % 10;
                if (a == 0 || n % a != 0) {
                    self = false;
                    break;
                }
                i /= 10;
            }
            if (self) {
                arr.push_back(n);
            }
        }
        return arr;
    }
};