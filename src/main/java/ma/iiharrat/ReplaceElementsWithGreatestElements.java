package ma.iiharrat;

import java.util.Arrays;
import java.util.Stack;

/*
Given an array arr, replace every element in that array with the greatest element 
among the elements to its right, and replace the last element with -1.
After doing so, return the array.
*/

public class ReplaceElementsWithGreatestElements {


    //brute force, wouldnt work on big input
    public int[] replaceElements(int[] arr) {
        int[] arr1 = new int[arr.length];
        arr1[0] = Arrays.stream(arr).max().orElse(Integer.MIN_VALUE); 
        for(int i =0; i<arr.length; i++){
            // Arrays.stream(arr).max().orElse(Integer.MIN_VALUE); 
            if(i == arr.length - 1){
                arr1[i] = -1;
            }else{
                arr1[i] = Arrays.stream(Arrays.copyOfRange(arr, i + 1, arr.length)).max().orElse(Integer.MIN_VALUE); 
            }
        }
        return arr1;
    }

    // optimized version
    public int[] replaceElementsBeta(int[] arr){
        int[] arr1 = new int[arr.length];
        int max = -1;
        for(int i = arr.length - 1; i >= 0; i--){
            arr1[i] = max;
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return arr1;
    }

    //using a stack
    public int[] replaceElementsUsingStack(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] arr1 = new int[arr.length];
        stack.push(-1);
        for(int i = arr.length - 1; i > 0; i--){
            if(stack.peek() > arr[i]){
                stack.push(stack.peek());
            }else stack.push(arr[i]);
        }
        for(int i = 0; i < arr.length;i++){
            arr1[i] = stack.pop();
        }
        return arr1;
    }


    public static void main(String[] args){
        ReplaceElementsWithGreatestElements replaceElementsWithGreatestElements = new ReplaceElementsWithGreatestElements();
        //int[] arr = replaceElementsWithGreatestElements.replaceElements(new int[]{17,18,5,4,6,1});
        //int[] arr2 = replaceElementsWithGreatestElements.replaceElements(new int[]{400});
        int[] arr1 = replaceElementsWithGreatestElements.replaceElementsUsingStack(new int[]{18,17,5,7,8});
        //int[] arr3 = replaceElementsWithGreatestElements.replaceElementsBeta(new int[]{400});
        System.out.println(Arrays.toString(arr1));
    }
}
