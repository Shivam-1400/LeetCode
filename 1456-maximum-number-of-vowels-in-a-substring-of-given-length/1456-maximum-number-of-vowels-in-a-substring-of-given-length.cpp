class Solution {
public:
    bool isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
    int maxVowels(string s, int k) {
        int vcnt=0;
        int mx_cnt=0;
        int windowStart=0;
        for(int i=0;i<s.size();i++){
            if(isVowel(s[i])){
                vcnt++;
            }
            mx_cnt = max(mx_cnt,vcnt);
            if(vcnt==k){
                return vcnt;
            }
            if(i-windowStart+1>=k){
                if(isVowel(s[windowStart])){
                    vcnt--;
                }
                windowStart++;
            }
        }
        return mx_cnt;
    }
};