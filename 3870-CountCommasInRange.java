/*
 * LeetCode 3870. Count Commas in Range
 *
 * Given an integer n, return the total number of commas used when
 * writing all integers from [1, n] in standard number formatting.
 *
 * A comma is inserted after every three digits from the right.
 * Numbers with fewer than 4 digits contain no commas.
 *
 * Example 1:
 * Input: n = 1002
 * Output: 3
 *
 * Explanation:
 * "1,000", "1,001", and "1,002" each contain one comma.
 *
 * Example 2:
 * Input: n = 998
 * Output: 0
 *
 * Constraints:
 * 1 <= n <= 10^5
 */
class Solution {
    public int countCommas(int n) {
        int num=n,c=0;
        while(n!=0){
            c++;
            n/=10;
        }
        int t=0;
        if(c>=4){
            for(int i=1000;i<=num;i++){
               t++;
            }
            return t;
        }
        return 0;
    }
}
