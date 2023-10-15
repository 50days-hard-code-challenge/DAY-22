class Solution {
public:
    int maxProduct(vector<int>& nums) {
        if (nums.empty()) {
            return 0;
        }

        int maxpro = nums[0];
        int Max = nums[0];
        int Min = nums[0];

        for (int i = 1; i < nums.size(); i++) {
            if (nums[i] < 0) {
                swap(Max, Min);
            }
            Max = max(nums[i], Max * nums[i]);
            Min = min(nums[i], Min * nums[i]);
            maxpro = max(maxpro, Max);
        }

        return maxpro;
    }
};
