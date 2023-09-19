class Solution {
    public int findDuplicate(int[] nums) {

        int slow= nums[nums[0]];
        int fast= nums[nums[nums[0]]];
        int i=0;
        System.out.println(i++ +" "+fast+" "+ slow);

        while(slow != fast){
            fast= nums[nums[fast]];
            slow= nums[slow];
            System.out.println(i++ +" "+fast+" "+ slow);
        }
        System.out.println(i++ +" "+fast+" "+ slow);
        i=0;
        slow= nums[0];
        while(slow != fast){
            fast= nums[fast];
            slow= nums[slow];
            System.out.println(i++ +" "+fast+" "+ slow);
        }
        return slow;
    }
}