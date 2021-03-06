/**
 * Created by Mythri on 09/3/16.
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
   Note:You may assume that nums1 has enough space (size that is greater or equal to m + n) to 
   hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
 */
import java.util.Arrays;
public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;

        int k = m + n -1;

        while(i >= 0 && j >=0){
            if(nums1[i] > nums2[j] ){
                nums1[k] = nums1[i];
                k--;
                i--;
            }
            else{
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
        while( i >= 0){
            nums1[k--] = nums1[i--];
        }
        while( j >= 0){
            nums1[k--] = nums2[j--];
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int nums1[] = {1,3,4,5,6,0};
        int nums2[] = {2};
        int m = 5;
        int n = 1;
        MergeSortedArrays obj = new MergeSortedArrays();
        obj.merge(nums1,m,nums2,n);
    }
}
