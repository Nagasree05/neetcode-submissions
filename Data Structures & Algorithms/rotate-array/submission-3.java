class Solution {
    public void rotate(int[] nums, int k) {
        int j=0;
       k=k%nums.length;
        int[] res=new int[nums.length];
        for(int i=nums.length-k;i<nums.length;i++){
            res[j]=nums[i];
            j++;
        }
        for(int i=0;i<nums.length-k;i++){
            res[j]=nums[i];
            j++;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=res[i];
        }
    }
}