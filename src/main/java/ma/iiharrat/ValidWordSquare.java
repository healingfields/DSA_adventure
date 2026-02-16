package ma.iiharrat;

import java.util.*;


//Given an array of strings words, return true if it forms a valid word square.
//A sequence of strings forms a valid word square if the kth row and column read
//  the same string, where 0 <= k < max(numRows, numColumns).

public class ValidWordSquare{

    //TODO
    // the condition that verifies if we re not out of bounds is not clear to me
    public static boolean validWordSquareDelta(List<String> words){
        for(int i = 0; i<words.size(); i++){
            for(int j = 0; j<words.get(i).length(); j++){
                if(words.get(i).isEmpty() || words.get(i).charAt(j) != words.get(j).charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        List<String> example1 = Arrays.asList(
            "abcd",
            "bnrt",
            "crmy",
            "dtye"
        ); // expected: true

        List<String> example2 = Arrays.asList(
            "abcd",
            "bnrt",
            "crm",
            "dt"
        ); // expected: true

        List<String> example3 = Arrays.asList(
            "ball",
            "area",
            "read",
            "lady"
        ); // expected: false

        List<String> example4 = Arrays.asList(
            "",
            "b"
        ); // expected: false

        List<String> example5 = Arrays.asList(
                "ball","asee","let","lep"
        );

        System.out.println("example1 expected=true -> " + validWordSquareDelta(example1));
        System.out.println("example2 expected=true -> " + validWordSquareDelta(example2));
        System.out.println("example3 expected=false -> " + validWordSquareDelta(example3));
        System.out.println("example4 expected=false -> " + validWordSquareDelta(example4));
        System.out.println("example5 expected=false -> " + validWordSquareDelta(example5));
    }
}