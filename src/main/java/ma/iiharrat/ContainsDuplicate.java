package ma.showmaker;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
    Given an integer array nums, return true if any value appears at least 
    twice in the array, and return false if every element is distinct.
*/
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums){
        Set<Integer> set = IntStream.of(nums)
                                .boxed()
                                .collect(Collectors.toSet());
        return set.size() == nums.length ? false : true;
    }

    public boolean containsDuplicateBeta(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }


    public static void main(String[] args){
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        System.out.println(containsDuplicate.containsDuplicate(new int[]{1, 5, 1, 9, 10}));
        System.out.println(containsDuplicate.containsDuplicate(new int[]{1, 2, 10, 18, 15}));
    }
}
