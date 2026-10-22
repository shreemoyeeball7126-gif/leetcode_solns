class Solution {
    public int[] plusOne(int[] digits) {
        boolean ans=false;
		for(int i=0;i<digits.length;i++){
        if(digits[i]!=9) {
        	ans=true;
        }
        }
        if(digits[digits.length-1]!=9){
            digits[digits.length-1]=digits[digits.length-1]+1;
            return digits;
        }
        else if(ans==true &&digits[digits.length-1]==9){
            for(int i=digits.length-1;i>=0;i--){
                if(digits[i]==9){
                    digits[i]=0;
                }
                else{
                    digits[i]=digits[i]+1;
                    return digits;
                }
            }
            return digits;
        }
        else{
            digits = Arrays.copyOf(digits, digits.length+1);
            digits[0]=1;
            for(int i=1;i<digits.length;i++){
                digits[i]=0;
            }
            return digits;

        }
    }
}