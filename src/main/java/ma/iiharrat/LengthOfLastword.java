package ma.iiharrat;


// You are given a string s consisting of words and spaces, return the length of the last word in the string.
// A word is a maximal substring consisting of non-space characters only.


public class LengthOfLastword {

    // hint from copilot
    public int lengthOfLastWord(String word){
        String newString = word.trim();
        int count = 0;
        for(int i = newString.length() - 1; i >= 0; i--){
            if(newString.charAt(i) == ' '){
                break;
            }
            count++;
        }
        return count;
    }

    //the one i provided
    public int lengthOfLastWordBeta(String s) {
        String newS = s.trim();
        String[] arr = newS.split(" ");
        return arr[arr.length-1].length();
    }

    public static void main(String[] args){
        LengthOfLastword lengthOfLastword = new LengthOfLastword();
        String[] inputs = new String[]{
            "Hello World",
            "   fly me   to   the moon  ",
            "luffy is still joyboy",
            "Hello",
            "a ",
            " day",
            "   ",
            "",
            "one two three   ",
            "ab cd ef ghij kl"
        };

        int[] expected = new int[]{5,4,6,5,1,3,0,0,5,2};

        for(int i=0;i<inputs.length;i++){
            String in = inputs[i];
            int exp = expected[i];
            int out = lengthOfLastword.lengthOfLastWord(in);
            System.out.println("Input: '" + in + "' | Expected: " + exp + " | Actual: " + out);
        }
    }
}
