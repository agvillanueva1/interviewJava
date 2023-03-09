package SamsungPrep;

import java.util.Arrays;

public class SumOfTwoArray {
    //Returns the indexes of the sum

    public static void main(String[] args) {
        SumOfTwoArray sumOfTwoArray = new SumOfTwoArray();
        System.out.println(Arrays.toString(sumOfTwoArray.twoSum(new int[]{5,2,4},6)));

    }

    public int[] twoSum(int[] nums, int target){
        //Brute Force Method
        for (int i = 0; i < nums.length; i++){

            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }

        return nums;
    }
}
