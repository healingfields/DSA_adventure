package ma.iiharrat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    //Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order
    //An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

    public List<List<String>> groupAnagrams(String[] strs){
        List<String> copySorted = new ArrayList<>();
        for(String s: strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            copySorted.add(new String(charArray));
        }
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0; i<copySorted.size();i++){
            map.computeIfAbsent(copySorted.get(i), k -> new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }


    public static void main(String[] args){
        GroupAnagrams ga = new GroupAnagrams();
        List<List<String>> list = ga.groupAnagrams(new String[]{"act", "cat", "pots", "stop"});
        System.out.println(list);
    }
}
