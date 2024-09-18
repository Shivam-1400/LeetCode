class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] numStr = new String[n];
        for(int i=0; i<n; i++){
            numStr[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(numStr, new Comparator<String>() {
            public int compare(String x, String y){
                String order1 = x+y;
                String order2 = y+x;
                return order1.compareTo(order2) > 0 ? -1 : 1;
            }
        });

        if (numStr[0].equals("0")) {
            return "0";
        }
        StringBuilder largest = new StringBuilder();
        for(int i=0; i<numStr.length; i++){
            largest.append(numStr[i]);
        }

        return largest.toString();
    }
}