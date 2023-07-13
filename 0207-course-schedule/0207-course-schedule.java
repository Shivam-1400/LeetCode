class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n= numCourses;
        List<Integer>[] ax= new List[n];
        int[] indeg=  new int[n];
        List<Integer> ans= new ArrayList<>();
        
        for(int i=0; i< prerequisites.length; i++){
            int course= prerequisites[i][0];
            int prereq= prerequisites[i][1];
            
            if(ax[prereq]== null){
                ax[prereq]= new ArrayList<>();
            }
            ax[prereq].add(course);
            indeg[course]++;
        }
        
        Queue<Integer> qe= new LinkedList<>();
        for(int i=0; i< n; i++){
            if(indeg[i]==0){
                qe.add(i);
            }
        }
        while(!qe.isEmpty()){
            int temp= qe.remove();
            ans.add(temp);
            
            if(ax[temp] != null){
                for(int i=0; i< ax[temp].size(); i++){
                    int nx= ax[temp].get(i);
                    indeg[nx]--;
                    if(indeg[nx]==0){
                        qe.add(nx);
                    }
                }
            }
        }
        return ans.size()==n;
    }
}