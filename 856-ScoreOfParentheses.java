/*
Given a balanced parentheses string s, return the score of the string.

The score of a balanced parentheses string is based on the following rule:

"()" has score 1.
AB has score A + B, where A and B are balanced parentheses strings.
(A) has score 2 * A, where A is a balanced parentheses string. 

Example 1:

Input: s = "()"
Output: 1
Example 2:

Input: s = "(())"
Output: 2
Example 3:

Input: s = "()()"
Output: 2
 

Constraints:

2 <= s.length <= 50
s consists of only '(' and ')'.
s is a balanced parentheses string.
*/


class Solution {
    public int scoreOfParentheses(String s) {
        int m=0,c=0;
        int max=0;
        int st[]=new int[s.length()];
        int st2[]=new int[s.length()];

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                max++;
                st[i]=max;
            }
            else {
                max--;
                st2[i]=max;

                if(s.charAt(i-1)=='('){
                    int x=1;
                    for(int j=1;j<st[i-1];j++){
                        x=x*2;
                    }
                    c=c+x;
                }
            }
        }

        return c;
    }
}
