class Solution {
    public boolean lemonadeChange(int[] bills) {
        Map<Integer, Integer> mp= new HashMap<>();
        
        for(int a: bills){
            if(a==5){
                mp.put(a, mp.getOrDefault(a, 0)+1);
            }
            else if(a==10){
                if(mp.containsKey(5) && mp.get(5)> 0){
                    mp.put(5, mp.get(5)-1);
                    mp.put(a, mp.getOrDefault(a, 0)+1);
                }
                else{
                    return false;
                }
            }
            else if(a==20){
                if(mp.containsKey(5) && mp.get(5) >0 && mp.containsKey(10) && mp.get(10)> 0){
                    mp.put(5, mp.get(5)-1);
                    mp.put(10, mp.get(10)-1);
                    mp.put(a, mp.getOrDefault(a, 0)+1);
                }
                else if(mp.containsKey(5) && mp.get(5) >2 ){
                    mp.put(5, mp.get(5)-3);
                    mp.put(a, mp.getOrDefault(a, 0)+1);
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}