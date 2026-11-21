class Solution {
    public boolean validPalindrome(String s) {
          int left=0;
          int right=s.length()-1;
          while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
            return  leftremoval(s,left+1,right)||rightremoval(s,left,right-1);
            }
          
          left++;
          right--;
          }
          return true;
         
    }
    boolean leftremoval(String s ,int left, int right){
      
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
             return false;
            }
            left++;
            right--;
        }
        return true;
    }
    boolean rightremoval(String s, int left, int right){
       
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
             return false;
            }
            left++;
            right--;
        }
        return true;
    }
}