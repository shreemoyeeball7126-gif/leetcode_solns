class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[]arr=nums1;
        for(int i=0;i<m;i++){
            nums1[i]=arr[i];
        }
        for(int i=0;i<n;i++){
            arr[m+i]=nums2[i];
        }
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<i;j++){
                if(nums1[i]<nums1[j]){
                    int temp=nums1[i];
                    nums1[i]=nums1[j];
                    nums1[j]=temp;
                }
            }
        }

    }
}