class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp= new HashMap<>();
        
        for(int a: nums){
            if(mp.containsKey(a)){
                mp.put(a, mp.get(a)+1);
            }
            else{
                mp.put(a, 1);
            }
        }
        Map<Integer, List<Integer>> count2 = new TreeMap<>();
        for (int n: mp.keySet()) 
{
   List<Integer> numbersList = count2.get(mp.get(n));
    
    if(numbersList != null)
    {
        numbersList.add(n);
    }
    else
    {
        numbersList = new ArrayList<>();
        numbersList.add(n);
        count2.put(mp.get(n), numbersList);
    }
}


List<Integer> list = new ArrayList<>();

for(int  c : count2.keySet()) 
{
   List<Integer> numbersList = count2.get(c);
   
   list.addAll(numbersList);
}

int[] top = new int[k];

int i =0;

for(int j = list.size()-1 ; j >list.size()-1-k;  j--)
{
	top[i++] =list.get(j);
}
 
        return top;
    }
} 