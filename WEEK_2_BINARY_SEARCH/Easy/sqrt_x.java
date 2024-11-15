public class sqrt_x {

}

class Solution {
    public int mySqrt(int x) {
        int start = 0;
        int end = x;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((long) mid * mid == (long) x) {
                ans = mid;
                break;
            } else if ((long) mid * mid < (long) x) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
