class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> mp= new HashMap<>();
        for(int i=0; i< s.length(); i++){
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0)+1);
        }
        
        List<Character> ls= new ArrayList<>(mp.keySet());
        Collections.sort(ls, (a,b)-> mp.get(b)- mp.get(a));
        System.out.println(mp+"\n"+ls);
        String ans="";
        for(char x: ls){
            ans+= multiply(x, mp.get(x));
        }
        
        return ans;
    }
    String multiply(char x,int n){
        String a="";
        for(int i=0; i<n; i++){
            a+= x;
        }
        return a;
    }
}