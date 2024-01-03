class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans= new ArrayList<>();
        for(int hr=0; hr<12; hr++){
            for(int min= 0; min<60; min++){
                if(Integer.bitCount(hr)+ Integer.bitCount(min)== turnedOn){
                    String a= hr+":";
                    if(min<10){
                        a+='0';
                    }
                    a+= min;
                    ans.add(a);
                }
            }
        }
        return ans;
    }
}