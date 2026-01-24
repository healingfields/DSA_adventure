package ma.iiharrat;

import java.util.Arrays;

public class ConcatenationOfArray {

    /*
    Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
    Specifically, ans is the concatenation of two nums arrays.
    Return the array ans.
    */

    public int[] getConcatenation(int[] nums){
        int[] newArr = new int[nums.length * 2];
        for(int i = 0; i < nums.length; i++){
            newArr[i] = newArr[i + nums.length] = nums[i];
        }
        return newArr;
    } 
    public static void main(String[] args) {
        ConcatenationOfArray concatenationOfArray = new ConcatenationOfArray();
        System.out.println(Arrays.toString(concatenationOfArray.getConcatenation(new int[]{1, 3, 5, 10, 0})));
    }

}


