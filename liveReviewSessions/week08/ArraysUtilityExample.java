package week08;

import java.util.Arrays;

public class ArraysUtilityExample {
    public static void main(String[] args) {

        int [] nums = {5, 10, 4, 35, 1000};
        
        // Arrays utility class created by Java developers, and it has some useful methods that we can use, such as sort

        Arrays.sort(nums); // sorting your elements from smaller to larger
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));

        int [] numsTwo = {4, 5, 10, 1000};

        int [] numsThree = nums; // creating a new reference for the same object

        // Arrays.equals() is used to check if two arrays' content are equal
        System.out.println("Arrays.equals(nums, numsTwo) = " + Arrays.equals(nums, numsTwo));

        System.out.println(nums == numsTwo); // false checking if the object is equal

        System.out.println(nums == numsThree); // true

        System.out.println(Arrays.equals(nums, numsThree));


        nums[0] = 5000;
        System.out.println(Arrays.toString(numsThree));

        // copy of method

        int[] numsFour = Arrays.copyOf(nums,nums.length);

        nums[0] = 3000;

        System.out.println(Arrays.toString(numsFour));



    }
}
