class Solution {
public:
    int shipWithinDays(vector<int>& weights, int D) {
        int left = *max_element(weights.begin(), weights.end());
        int right = accumulate(weights.begin(), weights.end(), 0);

        while (left < right) {
            int mid = (left + right) / 2;

            int days = 1;
            int total_weight = 0;
            for (int weight : weights) {
                if (total_weight + weight > mid) {
                    days++;
                    total_weight = weight;
                } else {
                    total_weight += weight;
                }
            }

            if (days <= D) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
};