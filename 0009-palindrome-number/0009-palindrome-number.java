class Solution {
    public boolean isPalindrome(int x) {
        int y=0;
        int dub=x;
        while(dub>0){
            int rem=dub%10;
            y=10*y+rem;
            dub=dub/10;
        }
        return y==x;
        
    }
}