package ma.iiharrat;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Given two strings s and t, return true if t is an of s, and false otherwise.
*/
public class ValidAnagram {

    //brute force
    public boolean isAnagram(String str1, String str2){
        Map<Character, Integer> map1 = createMap(str1);
        Map<Character, Integer> map2 = createMap(str2);

        return map1.equals(map2);
    }

    private Map<Character, Integer> createMap(String str){
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
            else{
            map.put(str.charAt(i), 1);
            }
        }
        return map;
    }

    //solved through sorting
    public boolean isAnagramBeta(String str1, String str2){
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args){
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram("driss", "irdss"));
        System.out.println(validAnagram.isAnagram("car", "bike"));
        System.out.println(validAnagram.isAnagramBeta("car", "bike"));      
        System.out.println(validAnagram.isAnagramBeta("driss", "irdss"));
    }
}
