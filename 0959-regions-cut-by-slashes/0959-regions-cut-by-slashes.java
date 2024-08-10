class Solution {
    public int regionsBySlashes(String[] grid) 
    {
        int len = grid.length, side = len + 1;
        int[] parents = new int[side*side];
        for(int i = 0; i < parents.length; i++) parents[i] = i;
        
        int lastRowIndex = len*side;
        for(int i = 0; i < side; i++)
        {
            parents[i] = 0;
            parents[lastRowIndex+i] = 0;
            int edge = i*side;
            parents[edge] = 0;
            parents[edge + len] = 0;
        }
        
        int regions = 1;
        for(int i = 0; i < grid.length; i++)
        {
            String row = grid[i];
            for(int j = 0; j < row.length(); j++)
            {
                int x = -1, y = -1;
                if(row.charAt(j) == '/')
                {
                    x = (i * side) + j + 1;
                    y = ((i+1) * side) + j;
                }else if(row.charAt(j) == '\\')
                {
                    x = (i * side) + j;
                    y = ((i+1) * side) + j + 1;
                }
                
                if(x > -1)
                {
                    int parentx = find(x, parents), parenty = find(y, parents);
                    if(parentx == parenty) ++regions;
                    else union(parentx, parenty, parents);  
                }
            }
        }
        
        return regions;
    }
    
    public void union(int parentx, int parenty, int[] parents)
    {
        parents[parenty] = parentx;
    }
    
    public int find(int node, int[] parents)
    {
        int v = node;
        while(v != parents[v]) v = parents[v];
        parents[node] = v; //path compression
        return v;
    }
}