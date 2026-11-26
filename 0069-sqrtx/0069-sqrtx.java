class Solution {
    public int mySqrt(int x) {
        long b=x;
        long ans=0;
        for(long i=1;i<=(b/2)+1;i++){
            if(i*i <=b && (i+1)*(i+1)>b){
                ans=i;
                break;
            }
        }
        
        return (int)ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna