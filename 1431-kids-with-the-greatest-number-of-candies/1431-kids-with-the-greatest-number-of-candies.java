class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        // max-= extraCandies;
        // System.out.println(max);
        List<Boolean> a= new ArrayList<>();
        for(int i=0; i< candies.length; i++){
            if(candies[i]+ extraCandies >= max){
                a.add(true);
            }else{
                a.add(false);
            }
        }
        return a;
    }
}