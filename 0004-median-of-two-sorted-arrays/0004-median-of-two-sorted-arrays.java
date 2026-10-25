class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size=nums1.length+nums2.length;
        int arr[]=new int[size];
        for(int i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            arr[i+nums1.length]=nums2[i];
        }
        Arrays.sort(arr);
        double med;
        int ind;
        if(size%2!=0){
            ind=size/2;
            med=arr[ind];
        }
        else{
            int ind1=(size/2);
            ind=ind1-1;
            med=(arr[ind1]+arr[ind])/2.0;
        }
        return med;
    }
} 