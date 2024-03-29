class Solution {
public:
    int countPrimes(int n){
        if(n<2){
            return 0;
        }
        vector<bool> v(n,true);
        v[0]= false;
        v[1]= false;
        // int count=0;
        
        for(int i =2; i<sqrt(n); i++){
            if(v[i]){
                // count++;
                // cout<<i<<"\t"<<(bool)v[i]<<"\t"<<count<<endl;
                for(int j= i*i; j< n; j+=i){
                    v[j]=false;
                }
            }
        }
        // cout<<endl;
        return count(v.begin(), v.end(), true);
    }
};

