class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        
        return event1[0].compareTo(event2[1]) <= 0 && event2[0].compareTo(event1[1]) <= 0;
        
//         String a= event1[1];
//         String b= event2[0];
        
//         if(a.equals(b)){
//             return true;
//         }
//         int ah= Integer.parseInt(a.substring(0,2));
//         int bh= Integer.parseInt(b.substring(0,2));
//         if(ah- bh >0){
//             return false;
//         }
//         if(ah> bh){
//             return true;
//         }
        
//         int am= Integer.parseInt(a.substring(3));
//         int bm= Integer.parseInt(b.substring(3));
//         if(ah==bh && am>=bm){
//             return true;
//         }
//         return false;
    }
}