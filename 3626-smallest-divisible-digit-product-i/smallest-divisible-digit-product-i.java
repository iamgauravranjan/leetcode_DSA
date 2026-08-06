class Solution {

    int pro(int n){

        int p=1;

          while(n!=0){
            int dig=n%10;
            p*=dig;
            n=n/10;
        }
        return p;
    }
    public int smallestNumber(int n, int t) {
        
        while(pro(n)%t!=0){
            n++;
        }
       

        return n;
       
    }
}