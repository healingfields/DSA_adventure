package ma.iiharrat;

/*
You are given two strings s and t consisting of only lowercase English letters.
Return the minimum number of characters that need to be appended to the end of s
so that t becomes a subsequence of s. A subsequence is a string that can be derived
from another string by deleting some or no characters without changing the order
 of the remaining characters.
 s="", t="xyz" -> appended=3, result="xyz"
2) s="abc", t="ab" -> appended=0, result="abc"
3) s="abc", t="abcd" -> appended=1, result="d"
*/


public class AppendCharacterToCreateSubsequence {

    //apparently i dont understand subsequence correctly, the coaching coding made me wonder 
    public int appendCharacters(String s, String t){
        int j = 0;
        for(int i = 0; i<s.length() && j<t.length(); i++){
            if(t.charAt(j) == s.charAt(i)) j++;
        }
        return t.length() - j;
    }

    public static void main(String[] args){
        AppendCharacterToCreateSubsequence appendCharacterToCreateSubsequence = new AppendCharacterToCreateSubsequence();
        //System.out.println(appendCharacterToCreateSubsequence.appendCharacters("abc", "abcd"));
        System.out.println(appendCharacterToCreateSubsequence.appendCharacters("coaching", "coding"));
        System.out.println(appendCharacterToCreateSubsequence.appendCharacters("abacaba", "abadac"));
    }
}
