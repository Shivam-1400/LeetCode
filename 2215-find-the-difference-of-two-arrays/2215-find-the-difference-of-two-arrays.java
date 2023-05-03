// class Solution {
//     public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
//         List<List<Integer>>  ans= new ArrayList<List<Integer>>();
        
//         Map<Integer, Integer> mp= new HashMap<>();
//         for(int i=0;i< nums1.length; i++){
//             if(mp.containsKey(nums1[i])){
//                 mp.put(nums1[i], mp.get(nums1[i])+1);
//             }else{
//                 mp.put(nums1[i], 1);
//             }
//         }
//         for(int i=0; i< nums2.length; i++){
//             if(mp.containsKey(nums2[i])){
//                 mp.put(nums2[i], mp.get(nums2[i])-1);
//             }else{
//                 mp.put(nums2[i], 1);
//             }
//         }
//         List<Integer> l= new ArrayList<>();
//         for(int i=0; i< nums1.length; i++){
//             if(mp.get(nums1[i]) >0){
//                 l.add(nums1[i]);
//             }
//         }
//         List<Integer> l2= new ArrayList<>();
//         for(int i=0; i< nums2.length; i++){
//             if(mp.get(nums2[i]) !=0){
//                 l2.add(nums2[i]);
//             }
//         }
//         ans.add(l);
//         ans.add(l2);
//         return ans;
//     }
// }

class Solution {
    
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans= new ArrayList<List<Integer>>();
        
        
        
        Map<Integer, Integer> mp1= new HashMap<>();
        for(int i=0; i< nums1.length; i++){
            // if(mp1.containsKey(nums1[i])){
                mp1.put(nums1[i],1);
            // }
            // else{
            //     mp1.put(nums1[i], 1);
            // }
        }
        
        Map<Integer, Integer> mp2= new HashMap<>();
        for(int i=0; i< nums2.length; i++){
            // if(mp2.containsKey(nums2[i])){
                mp2.put(nums2[i], 1);
            // }
        }
        List<Integer> ax= new ArrayList<>();
        for(int i=0; i< nums1.length; i++){
            if(mp1.containsKey(nums1[i]) && ! mp2.containsKey(nums1[i])){
                ax.add(nums1[i]);
                mp1.remove(nums1[i]);
            }
        }
        ans.add(ax);
        ax= new ArrayList<>();
        for(int i=0; i< nums2.length; i++){
            if( mp2.containsKey(nums2[i]) && ! mp1.containsKey(nums2[i])){
                ax.add(nums2[i]);
                mp2.remove(nums2[i]);
            }
        }
        ans.add(ax);
        return ans;
        
        
    }
}