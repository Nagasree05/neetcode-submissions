class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        if(word1.length()>word2.length()){
         for(int i=0;i<word2.length();i++){
            char w1=word1.charAt(i);
            char w2=word2.charAt(i);
            sb.append(w1);
            sb.append(w2);
         }
         for(int i=word2.length();i<word1.length();i++){
            char w1=word1.charAt(i);
            sb.append(w1);
         }
        }
        else if(word2.length()>word1.length()){
         for(int i=0;i<word1.length();i++){
            char w1=word1.charAt(i);
            char w2=word2.charAt(i);
            sb.append(w1);
            sb.append(w2);
         }
         for(int i=word1.length();i<word2.length();i++){
            char w2=word2.charAt(i);
            sb.append(w2);
         }
        }
        else {
            for (int i = 0; i < word1.length(); i++) {
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }
}