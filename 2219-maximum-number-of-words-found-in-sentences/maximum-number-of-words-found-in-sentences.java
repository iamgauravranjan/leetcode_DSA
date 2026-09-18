class Solution {
    public int mostWordsFound(String[] sentences) {

        int ans=-1;
        
        
        for(int i=0;i<sentences.length;i++){
            int count=0;

           for(int j=0;j<sentences[i].length();j++){

            char ch=sentences[i].charAt(j);
            if(ch==' '){
                count++;

           }
           }

           ans=Math.max(ans,count);
        }

        return ans+1;
    }
}