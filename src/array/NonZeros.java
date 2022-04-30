package array;

import java.util.Arrays;

public class NonZeros {
     public static void main(String[] args) {
        int[] intArray = new int[]{ 0,1,0,3,12 }; 
        moveZeroes_2(intArray);

    }
    public  static void moveZeroes_2(int[] nums) {

        for(int i =0 , j=0 ; i<nums.length && j<nums.length ; j++)
        {
            if(nums[j]!=0)
            {
               int temp =nums[i];
               nums[i++]=nums[j];
               nums[j]=temp;
        }  }

        System.out.print(Arrays.toString(nums));

    }
    public  static void moveZeroes(int[] nums) {
        System.out.print(Arrays.toString(nums));

        int counterPointer=0;
        int zeroPointer=0;
        while(counterPointer<nums.length)
        {
            if(nums[counterPointer]==0)
            {     
                counterPointer++;
            }
            else{
                 int temp=nums[zeroPointer];
                nums[zeroPointer]=nums[counterPointer];
                nums[counterPointer]=temp;
                counterPointer++;
                zeroPointer++;

            }
        }
        System.out.print(Arrays.toString(nums));

    }
    
}
