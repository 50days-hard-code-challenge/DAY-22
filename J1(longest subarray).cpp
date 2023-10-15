public class Solution {  
      public static int longestSubarrayWithSumK(int []a, long k) {  
                // Write your code here      
                int currentSum = 0;       
                int maxSum = 0;    
                int startIndex = 0;

       for(int i = 0;i<a.length;i++){

           currentSum+= a[i];

           while(currentSum > k){   
            currentSum -= a[startIndex];     
            startIndex++;   
     }

           if(currentSum == k){    
            maxSum = Math.max(maxSum, i - startIndex + 1);    
             }  
                   }     
 return maxSum;    } }

