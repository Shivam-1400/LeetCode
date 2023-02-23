class Solution {
public:
    void setZeroTT(vector<vector<int>>& matrix, int ii, int jj){
        int n= matrix.size();
        int m= matrix[0].size();
        for(int i=0; i<n; i++){
            // matrix[ii][i]=0;
            matrix[i][jj]=0;
        }
        for(int i=0; i<m; i++){
            matrix[ii][i]=0;
        }
    }
    void setZeroes(vector<vector<int>>& matrix) {
        int n= matrix.size();
        int m= matrix[0].size();
        vector<pair<int, int>>pairs;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j]==0){
                    pairs.push_back(make_pair(i,j));
                }
            }
        }
        for(auto x: pairs){
            int i= x.first;
            int j= x.second;
            setZeroTT( matrix, i, j);
        }
    }
};