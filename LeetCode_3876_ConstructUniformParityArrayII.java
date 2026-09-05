class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int e = 0, o = 0;
        int min = nums1[0];
        for (int i = 0; i < n; i++) {
            if (nums1[i] % 2 == 0) {
                e++;
            } else {
                o++;
            }
            if (nums1[i] < min) {
                min = nums1[i];
            }
        }
        if (min % 2 != 0) {
            return true;
        }
        if (o == 0) {
            return true;
        }
        return false;
    }
}
