class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        boolean  ans=false;
        int[]arr=new int[2];
        while(ans==false){
            if(numbers[left]+numbers[right]==target){
                ans=true;
                arr[0]=left+1;
                arr[1]=right+1;
            }
            else if(numbers[left]+numbers[right]>target){
                right=right-1;
            }
            else if(numbers[left]+numbers[right]<target){
                left=left+1;
            }
            
        }
        return arr;
        
    }
}