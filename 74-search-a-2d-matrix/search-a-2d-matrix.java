class Solution {
    public boolean searchMatrix(int[][] arr, int target) {


        int rows=arr.length;
        int col=arr[0].length;
        int el=rows*col;

        int l=0;
        int r=el-1;

        while(l<=r){

            int mid=l+(r-l)/2;
            int ri=mid/col;

            int ci=mid%col;

            if(arr[ri][ci]==target)return true;
            else if(arr[ri][ci]>target) r=mid-1;
            else l=mid+1;
        }

        return false;
        
    }
}