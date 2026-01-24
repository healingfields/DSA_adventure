package ma.iiharrat;

public class ScoreOfString {


    /*
        3110. Score of a String
        You are given a string s. The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.
        Return the score of s.
    */  
    public int scoreOf(String str){
        int count = 0;
        for(int i = 0; i < str.length() - 1; i++){
            count = count + Math.abs((int) str.charAt(i) - (int) str.charAt(i + 1));
        }
        return count;
    }

    public static void main(String[] args){
        ScoreOfString scoreOfString = new ScoreOfString();
        System.out.println(scoreOfString.scoreOf("hello"));
    }
}
