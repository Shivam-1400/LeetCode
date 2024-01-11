class Solution {
public:
    long long putMarbles(vector<int>& weights, int k) {
        vector<int> wsum;
        for (int i=0;i<weights.size()-1;i++){
            wsum.push_back(weights[i]+weights[i+1]);
        }
        sort(wsum.begin(),wsum.end());
        long long  minsum=0;
        long long  maxsum=0;
        for (int i=0;i<k-1;i++){
            minsum+=wsum[i];
            maxsum+=wsum[weights.size()-2-i];

        }
        return maxsum-minsum;
    }
};