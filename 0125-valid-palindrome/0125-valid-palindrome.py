class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        sn=s.lower()
        new_str=""
        for i in sn:
            if i.isalnum():
                new_str=new_str+i
        
        for i in range(0,len(new_str)):
            if new_str[i]!=new_str[len(new_str)-i-1]:
                return False
        return True
        