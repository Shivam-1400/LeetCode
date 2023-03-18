class Solution {
    public void setZeroes(int[][] matrix) {
        int n= matrix.length;
        int m= matrix[0].length;
        ArrayList<Integer> r= new ArrayList<>();
        ArrayList<Integer> c= new ArrayList<>();
        for(int i=0; i< n; i++){
            for(int j=0; j< m; j++){
                if(matrix[i][j]==0){
                    r.add(i);
                    c.add(j);
                }
            }
        }
        // for(int ii=0; ii< r.size(); ii++){
        //     int rx= r.get(ii);
        //     for(int i=0; i< matrix[rx].length; i++){
        //         matrix[rx][i]=0;
        //     }
        // }
        for(int i=0; i< r.size(); i++){
            int rx= r.get(i);
            for(int j=0; j< m; j++){
                matrix[rx][j]=0;
            }
        }
        for(int i=0; i< c.size(); i++){
            int cx= c.get(i);
            for(int j=0; j< n; j++){
                matrix[j][cx]=0;
            }
        }
    }
}