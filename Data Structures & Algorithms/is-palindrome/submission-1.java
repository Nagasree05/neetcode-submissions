class Solution {
    public boolean isPalindrome(String s) {
        String res=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<res.length();i++){
            char ch=res.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
               sb.append(ch);
            }
        }
        String res1=sb.toString();
        int left=0;
        int right=res1.length()-1;
        while(left<right){
            
           if(res1.charAt(left)!=res1.charAt(right)){
             return false;
           }
           left++;
           right--;
        }
        return true;
    }
}
