class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                count=1;
                int current = num;
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }
            }
            
            max=Math.max(count,max);
        }
        return max;
    }
}