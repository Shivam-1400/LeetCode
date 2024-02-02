// class Solution {
//     public List<Integer> sequentialDigits(int low, int high) {
//         int mindig= digits(low);
//         int maxdig= digits(high);
        
//         List<List<Integer>> nums= new ArrayList<>();
//         // List<Integer> ls= Arrays.asList(12, 23, 34, 45, 56, 67, 78, 89);
//         // List<Integer> ls= Arrays.asList(123, 234, );
//         // List<Integer> ls= Arrays.asList();
        
//         for(int i=mindig; i<= maxDig; i++){
            
//         }
        
//         return ls;
        
        
        
//     }
//     int digits(int num){
//         int dig=0;
//         while(num> 0){
//             dig++;
//             num/=10;
//         }
//     }
// }

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            int num = i;

            for (int j = i + 1; j <= 9; j++) {
                num = num * 10 + j;

                if (num >= low && num <= high) {
                    result.add(num);
                }
            }
        }

        Collections.sort(result);
        return result;
    }
}