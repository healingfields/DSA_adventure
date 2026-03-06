package ma.iiharrat;

import java.util.*;


public class MajorityElement {

   /* Given an array nums of size n, return the majority element.
    The majority element is the element that appears more than ⌊n / 2⌋ times in the array.
    You may assume that the majority element always exists in the array.*/

    // HashMap with int and count => retrieving the max is a hustle
    // arrays its indexes represent the int, and its value represent the count => retrieving the max is easier
    // Input: nums = [5,5,1,1,1,5,5]


    public int majorityElement(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        Optional<Integer> max = map.entrySet()
                .stream()
                .filter(Objects::nonNull)
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
        return max.get();
    }

    //boyer moore voting algorithm
    public int majorityElementBeta(int[] nums){
        int count = 0, candidate = 0;
        for(int i: nums){
            if(count == 0){
                candidate = i;
            }
            count += (i == candidate) ? 1 : -1;
        }
        return candidate;
    }


    public static void main(String[] args){
        MajorityElement me = new MajorityElement();
        int i = me.majorityElement(new int[]{1, 1, 2, 3, 5, 1, 2});
        int j = me.majorityElementBeta(new int[]{1, 1, 2, 3, 5, 1, 2});
        System.out.println(j);
    }

}
