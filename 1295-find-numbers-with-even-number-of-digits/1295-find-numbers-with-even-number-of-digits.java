class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int c=0;
            int key=nums[i];
            while(key>0){
                key=key/10;
                c++;
            }
            if(c%2==0){
                count++;
            }
        }
        return count;
    }
}