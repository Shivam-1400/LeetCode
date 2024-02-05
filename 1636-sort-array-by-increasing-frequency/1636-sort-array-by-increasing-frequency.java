class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> mp= new HashMap<>();
        for(int x: nums){
            mp.put(x, mp.getOrDefault(x, 0)+1);
        }
        System.out.println(mp);
        List<Integer> ls= new ArrayList<>(mp.keySet());
        System.out.println(ls);
        // Collections.sort(ls, (a,b)->mp.get(a)-mp.get(b));
        Collections.sort(ls, (a,b)->{
            if(mp.get(a)== mp.get(b))return b-a;
            else return mp.get(a)-mp.get(b);
            });
        
        
        // Collections.sort(ls,new Comparator<Integer>(){
        //     public int compare(Integer a,Integer b){
        //         if(mp.get(a) == mp.get(b)){
        //             return b-a;
        //         }
        //         return mp.get(a) - mp.get(b);
        //     } 
        // });
        
        System.out.println(ls);
        int j=0;
        for(int x: ls){
            int cnt= mp.get(x);
            for(int i=0; i<cnt; i++){
                nums[j]= x;
                j++;
            }
        }
        return nums;
    }
}