import java.util.*;
    class code{
    public static String longest(String s1 , String s2){
         StringBuilder sb = new StringBuilder(s2.length());
         int n = Math.min(s1.length(), s2.length());
         for(int i=0; i<n; i++){
             if(s1.charAt(i)== s2.charAt(i)){
                 sb.append(s1.charAt(i));
             } else 
             break;
         }
         return sb.toString();
    }
    public static void main(String[] args){
        String[] input = {"flower" , "flow","flight"};
        String res = input[0];
        for(int i=1; i<input.length; i++){
             res = longest(res , input[i]);
        }
        System.out.println(res);

    }

    
}