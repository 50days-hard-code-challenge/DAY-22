int longestSubarrayWithSumK(vector<int> a, long long k) {
    /*int n = a.size(); 

    int len = 0;
    for (int i = 0; i < n; i++) { 
        for (int j = i; j < n; j++) { 
            
            long long s = 0;
            for (int K = i; K <= j; K++) {
                s += a[K];
            }

            if (s == k)
                len = max(len, j - i + 1);
        }
    }
    return len;*/

    int n = a.size(); 

    int left = 0, right = 0; 
    long long sum = a[0];
    int maxLen = 0;
    while (right < n) {
       
        while (left <= right && sum > k) {
            sum -= a[left];
            left++;
        }

       
        if (sum == k) {
            maxLen = max(maxLen, right - left + 1);
        }

       
        right++;
        if (right < n) sum += a[right];
    }

    return maxLen;
    

}
