class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0){
            return false;
        }
        // long long rev=0;
        // long long cp=x;
        // while(x>0){
        //     int temp= x%10;
        //     rev= rev*10+ temp;
        //     x= x/10;
        // }
        // if(cp== rev){
        //     return true;
        // }else{
        //     return false;
        // }

        string a= to_string(x);
        int n= a.length();
        int i=0;
        int j=n-1;
        while(i<j){
            if(a[i]!= a[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
};