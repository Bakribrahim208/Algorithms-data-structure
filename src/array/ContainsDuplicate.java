package array;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] intArray = new int[] { 1,2,13  };
        boolean reuslt = containsDuplicateUsingHash(intArray);
        System.out.println(reuslt);
    }
    public static boolean containsDuplicateUsingHash(int[] nums) {
        
       HashSet<Integer> data=new  HashSet<>();

        for(int i=0; i < nums.length; i++) {
            if(data.contains(nums[i])) {
                return true;
            }
            else{
                data.add(nums[i]);
            }
        }

        return false;
    }
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                return true;
            }
        }

        return false;
    }
}
