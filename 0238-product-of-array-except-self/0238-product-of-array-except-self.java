class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=prod;
            prod=prod*nums[i];
        }
        int rprod=1;
        for(int i=nums.length-1;i>=0;i--){
            arr[i]=arr[i]*rprod;
            rprod=rprod*nums[i];
        }
        return arr;
    }
}