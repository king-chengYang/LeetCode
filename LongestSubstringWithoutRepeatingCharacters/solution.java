public class solution {
    public int lengthOfLongestSubstring(String s) {
        int max_length=0,s_length=s.length(),begin=0,end=1;
        char[] s_array=s.toCharArray();

        if(s_length==0)
            return 0;
        if(s_length==1)
            return 1;
        while(begin < s_length){
            for(;end<s_length;end++){
                int i=begin;
                for(;i<end;i++){
                    if(s_array[i]!=s_array[end]);
                    else
                        break;
                }
                if(i != end){
                    max_length=(end-begin)>max_length?(end-begin):max_length;
                    begin=i+1;
                    break;
                }
                if(i+1 == s_length){
                    max_length=(s_length-begin)>max_length?(s_length-begin):max_length;
                    return max_length;
                }
            }
        }
        return max_length;
    }
    public static void main(String[]args){
        solution solutionTest=new solution();
        int answer=solutionTest.lengthOfLongestSubstring(" ");
        System.out.println(answer);
    }
}
