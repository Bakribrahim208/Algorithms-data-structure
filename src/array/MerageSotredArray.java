package array;
import java.util.Arrays;

public class MerageSotredArray {

    //reverse String 
    public static void main(String[] args) {
        int[] intArray = new int[]{ 1,2,3,5,31,0,0,0,0 }; 
        int[] intArray2 = new int[]{4,5,6,30 }; 
        merge(intArray,5,intArray2,4);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p=m+n -1; //last empty elemnt in result arrray
        int p1 =m -1 ;// last element in array1
        int p2 =n -1 ; // last elment in array 2
        while(p1>=0&& p2>=0)
        {
            if(nums1[p1]>nums2[p2])
            {
                nums1[p]=nums1[p1];
                p1--;
                p--;
            }
            else{
                nums1[p]=nums2[p2];
                p2--;
                p--;
            }
        }

        // to ensure we finish the second array pointer 
        while( p2>=0)
        {
            nums1[p]=nums2[p2];
            p2--;
            p--;
        }

        System.out.print(Arrays.toString(nums1));
    }
    
}
