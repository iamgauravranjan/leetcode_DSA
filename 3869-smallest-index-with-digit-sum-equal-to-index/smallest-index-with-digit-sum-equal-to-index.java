class Solution {

    int sod(int i){

        int sum=0;
        while(i!=0){
            int dig=i%10;
            sum+=dig;
            i=i/10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        int ans=-1;

        for(int i=0;i<nums.length;i++){

           int a= sod(nums[i]);
           if(a==i){
            ans=i;
            break;
           }

        }

        return ans;
        
    }
}