class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int j=0;
        HashMap<Integer,Integer>a=new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(a.containsKey(nums[i])){
                continue;
            }else{
                a.put(nums[i],0);
                nums[j]=nums[i];
                j++;
                k++;
            }
        }

        return k;
    }
}