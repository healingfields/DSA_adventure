package ma.iiharrat;

import java.util.Stack;

/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by 
deleting some (can be none) of the characters without disturbing the relative positions of
 the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not). 
 
 */
public class IsSubsequence {

    //brute force
    public boolean isSubsequence(String str1, String str2){
        if(str1.isEmpty() || str2.isEmpty()){
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str1.length(); i++){
            stack.push(str1.charAt(i));
        }
        for(int j=str2.length()-1; j>=0; j--){
            if(stack.peek() == str2.charAt(j)){
                stack.pop();
            }
        }
        return stack.empty() ? true : false;
    }

    //double pointer
    public boolean isSubsequenceBeta(String str1, String str2){
        int j = 0;
        for(int i = 0; i < str2.length() && j < str1.length(); i++){
            if(str2.charAt(i) == str1.charAt(j)){
                j++;
            }
        }
        return j == str1.length();
    }



    public static void main(String[] args){
        IsSubsequence isSubsequence = new IsSubsequence();
        //System.out.println(isSubsequence.isSubsequence("axc", "ahbgdc"));
        //System.out.println(isSubsequence.isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence.isSubsequenceBeta("axc", "ahbgdc"));
        System.out.println(isSubsequence.isSubsequenceBeta("abc", "ahbgdc"));
    }
}
