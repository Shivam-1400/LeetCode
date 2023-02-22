class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        int n= stones.length;
        for(int i= n-1; i>0; i--){
            System.out.print(stones[i]+" "+ stones[i-1]+"-----");
            stones[i-1]= Math.abs(stones[i]- stones[i-1]);
            System.out.println(stones[i-1]);
            Arrays.sort(stones);
        }
        return stones[0];
    }
}