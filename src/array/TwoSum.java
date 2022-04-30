package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] intArray = new int[] {  2,7,11,15  };

        int[] result = twoSum(intArray, 9);
        System.out.print(Arrays.toString(result));

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>maps =new HashMap<>();
        for(int i =0 ; i<nums.length;i++){
        int complement =target-nums[i];
        if(maps.containsKey(complement))
        {
            return new int[]{maps.get(complement),i};
        }
        maps.put(nums[i], i);
        }
        throw new IllegalArgumentException();
    }
    // accpeted but not good soluation
    // public static int[] twoSum(int[] nums, int target) {

    // for(int i =0 ; i<nums.length;i++){
    // for(int j =i+1 ; j<nums.length;j++)
    // {
    // if(nums[i]+nums[j]==target)
    // {

    // return new int[]{ i,j };
    // }
    // }

    // }

    // throw new IllegalArgumentException();
    // }

}
