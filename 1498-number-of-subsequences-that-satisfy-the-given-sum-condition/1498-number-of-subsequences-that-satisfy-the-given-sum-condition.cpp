#define mod 1000000007
#define ll long long
class Solution {
    ll modPwr(ll a, ll n){
        ll res = 1ll;
        while(n){
            if(n&1) res = (res*a)%mod;
            a =(a*a)%mod;
            n >>= 1;
        }
        return res;
    }

public:
    int numSubseq(vector<int>& nums, int tar) {
        sort(nums.begin(), nums.end());
        int cnt = 0, l = 0, r = nums.size() - 1;

        while( l<=r ){
            if( nums[l] + nums[r] > tar ) r--;
            else cnt = (cnt + modPwr(2, r-l++) )%mod;
        }
        return cnt;
    }
};