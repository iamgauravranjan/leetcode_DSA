class Solution {
    public boolean canAliceWin(int[] nums) {

        int sum1=0;
        int sum2=0;

        for(int el:nums){
            if(el>9){
                sum1+=el;
            }else{

                sum2+=el;

            }
            
        }
        if(sum1==sum2) return false;

        return true;
        
    }
}