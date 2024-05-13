class Solution {
    public int matrixScore(int[][] grid) {
        for(int i=0;i<grid.length;i++)
        {
            if(grid[i][0]==0)
            {
                for(int j=0;j<grid[0].length;j++)
                {
                    if(grid[i][j]==0)
                    grid[i][j]=1;
                    else
                    grid[i][j]=0;
                }
            }
        }
        int count0=0,count1=0;
        for(int j=0;j<grid[0].length;j++)
        {
            count0=0;count1=0;
            
            for(int i=0;i<grid.length;i++)
            {
                if(grid[i][j]==1)
                count1++;
                else
                count0++;
            }
            if(count0>count1)
            {
                for(int i=0;i<grid.length;i++)
                {
                    grid[i][j]= grid[i][j]==0?1:0;
                }
            }
        }
        int total=0;
            StringBuilder  ans= new StringBuilder();

        for(int i=0;i<grid.length;i++)
        {
            ans=new StringBuilder();
            for(int j=0;j<grid[0].length;j++)
            {
                ans.append(grid[i][j]);
            }
            total+=Integer.valueOf(ans.toString(),2);
        }
        return total;
        
    }
}