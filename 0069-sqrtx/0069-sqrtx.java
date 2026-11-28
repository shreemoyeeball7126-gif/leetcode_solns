class Solution {
    public int mySqrt(int x) {
        int low=1;
        int high=x;
        
        
        if(x==1){
            return 1;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            
            if(mid<x/mid){
                low=mid+1;
            }
            else if(mid>x/mid){
                high=mid-1;
            }
            else{
                
                return mid;
            }
            
        }
        return high;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna