class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count=0;
        List<Integer> ele = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if (ele.contains(nums[i])) continue;
            count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>nums.length/3){
                ele.add(nums[i]);

            }

        }
        return ele;
    }
}