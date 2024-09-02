class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        for(int i=0;i<chalk.length;i++)
        {
            if(chalk[i]<=k)
            {
                k=k-chalk[i]; 
            }
            else
            {
                return i;
            }
            if(i==chalk.length-1)
            {
                i=-1;
            }
        }
        return 0;
    }
}