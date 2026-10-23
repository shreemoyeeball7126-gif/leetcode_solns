class Solution {
    public int missingNumber(int[] nums) {
        int count=0;
        for(int i=0;i<=nums.length;i++){
            count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==i){
                    count++;
                }
            }
            if(count==0){
                return i;
            }
        }
        return 0;
    }
}