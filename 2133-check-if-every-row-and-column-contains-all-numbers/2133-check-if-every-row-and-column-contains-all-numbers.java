class Solution {
    public boolean checkValid(int[][] matrix) {
        int n= matrix.length;
        // int[] visited= new int[];
        Set<Integer> set = new HashSet<Integer> (); 
        Set<Integer> setCol = new HashSet<Integer> (); 
        for(int i=0; i< n; i++){
            for(int j=0; j< n; j++){
                set.add(matrix[i][j]);
                setCol.add(matrix[j][i]);
            }
            if(set.size()< n || setCol.size()< n){
                return false;
            }
            set = new HashSet<Integer> ();
            setCol = new HashSet<Integer> ();
        }
        return true;
        
        
    }
}