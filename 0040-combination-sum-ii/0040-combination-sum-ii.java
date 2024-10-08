class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates,target,result,curr,0);
        return result;
    }

    public void solve(int[] candidates, int target , List<List<Integer>> result, List<Integer> curr , int idx)
    {
      if(target < 0)
      {
        return;
      }

      if(target == 0)
      {
        result.add(new ArrayList<>(curr));
        return;
      }

      for(int i=idx;i<candidates.length;i++)
      {
        if(i > idx && candidates[i] == candidates[i-1])
        {
          continue;
        }
        curr.add(candidates[i]);
        solve(candidates,target - candidates[i],result,curr,i + 1);
        curr.remove(curr.size() - 1);
      }
    }
}