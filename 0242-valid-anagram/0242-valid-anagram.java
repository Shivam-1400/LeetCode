class Solution {
    public boolean isAnagram(String s, String t) {
        int n= s.length();
        int m= t.length();
        if(n != m){
            return false;
        }
        Map<Character, Integer> smp= new HashMap<>();
        Map<Character, Integer> tmp= new HashMap<>();
        for(int i=0; i< n; i++){
            char sx= s.charAt(i);
            smp.put(sx, smp.getOrDefault(sx, 0)+1);
            
            char tx= t.charAt(i);
            tmp.put(tx, tmp.getOrDefault(tx, 0)+1);
        }
        int fla=0;
        for(Map.Entry<Character, Integer> et: smp.entrySet()){
            if(tmp.containsKey(et.getKey())){
                if(tmp.get(et.getKey()).equals(et.getValue())){
                    continue;
                }
                fla= 1;
                break;
            }
            fla= 1;
            break;
        }
        return fla==0;
    }
}