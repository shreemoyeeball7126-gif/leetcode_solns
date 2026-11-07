class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        List<Integer> numbers = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        
        }
        int c=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()>nums.length/3){
                numbers.add(entry.getKey());
                
            }
        }
        return numbers;
    }
}