public class Solution {
    public static String oddEven(int N){
        // Write your code here.
        String str="even";

        if(N%2!=0)
        {
            str="odd";
            return str;
        }
        return str;
    }
}
