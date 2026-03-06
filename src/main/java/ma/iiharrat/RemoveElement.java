package ma.iiharrat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveElement {
    /**
    You are given an integer array nums and an integer val. Your task is to remove all occurrences of val from nums in-place.
    After removing all occurrences of val, return the number of remaining elements, say k, such that the first k elements of nums do not contain val.
            Note:
    The order of the elements which are not equal to val does not matter.
    It is not necessary to consider elements beyond the first k positions of the array.
    To be accepted, the first k elements of nums must contain only elements not equal to val.

    Return k as the final result.
    **/

    public int removeElement(int[] nums, int val){
        int counter = 0;
        for (int integer : nums) {
            if (integer != val) {
                nums[counter++] = integer;
            }
        }
        return counter;
    }

    public static void main(String[] args){
        RemoveElement re = new RemoveElement();
        int i = re.removeElement(new int[]{1, 1, 2, 3, 4}, 1);
        System.out.println(i);
    }
}
