// Sliding Window Problem
class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        String ans = "";
        int i = 0, j = 0;
        int count = 0;   // it is number of one's
        
        while (j < n) {
            if (s.charAt(j) == '1') {
                // count the number of ones
                count++;
            }
            if (count == k) {
                while (i < n && count == k) {
                    String s1 = s.substring(i, j + 1);
                    if (ans.isEmpty() || s1.length() < ans.length()) {
                        ans = s1;
                    } 
                    else if (s1.length() == ans.length()) {
                        ans = (ans.compareTo(s1) < 0) ? ans : s1;

                    //checks if ans is lexicographically less than s1.
                        // if (ans.compareTo(s1) < 0) {
                        //           ans = ans;
                        //  }  
                        //   else{
                        //            ans = s1;
                        //         }

                    }
                    // remove the character 
                    if (s.charAt(i) == '1') {
                        count--;
                    }
                    i++;
                }
            }
            j++;
        }
        return ans;
    }
}
