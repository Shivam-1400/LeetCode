class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> mp= new HashMap<>();
        for(int x: arr){
            mp.put(x, mp.getOrDefault(x, 0)+1);
        }
        System.out.println(mp);
        List<Integer> ls= new ArrayList<>(mp.keySet());
        Collections.sort(ls, (a, b)-> mp.get(a)- mp.get(b));
        System.out.println(ls);
        
        int i=0;
        int cnt =0;
        while(k>0 && i< ls.size()){
            int freq= mp.get(ls.get(i));
            if(freq<=k){
                k= k- freq;
                cnt++;
            }
            i++;
        }
        
        
        return ls.size()- cnt;
    }
}