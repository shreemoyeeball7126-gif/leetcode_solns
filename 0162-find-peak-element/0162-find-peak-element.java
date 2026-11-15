class Solution {
    public int findPeakElement(int[] nums) {
        
        int left=0;
        int right=nums.length-1;
        int ind=0;
        while (left<=right){
            int mid=left+(right-left)/2;
            if(mid !=0 && mid !=nums.length-1){
            if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1]){
                return mid;
            }
            else if(nums[mid]<nums[mid+1]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
            }   
            else{
                if(mid==0 && mid==nums.length-1){
                    return mid;
                }
                else if(mid==0  ){
                    if(nums[mid+1]>nums[mid]){
                        return mid+1;
                    }
                    else{
                        return mid;
                    }
                }
                else if(mid==nums.length-1){
                    if(nums[mid-1]>nums[mid]){
                        return mid-1;
                    }
                    else{
                        return mid;
                    }
                }
            }
        }

        return ind;
    
    }
}