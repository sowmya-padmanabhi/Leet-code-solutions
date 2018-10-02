//There are two sorted arrays nums1 and nums2 of size m and n respectively.
//Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
//You may assume nums1 and nums2 cannot be both empty.

public class medianTwoLists {

    public static double findMedianSortedArrays(int[] nums1,int[] nums2){
        float a ;
        float b ;
        if(nums1.length%2==0 && nums2.length%2==0){
            a = nums1[(nums1.length/2) -1 ];
            b = nums2[(nums2.length/2) - 1];
        }
        else{
            a = nums1[nums1.length/2];
            b = nums2[nums2.length/2];
        }

        float result = (a+b)/2;
        return result;
    }
    public static void main(String  args[]){

        int[] a = {1,2,3};
        int[] b = {2,3,4};
        double finalresult =findMedianSortedArrays(a,b);
    }
}
