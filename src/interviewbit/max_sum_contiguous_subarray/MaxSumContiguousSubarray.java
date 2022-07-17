package interviewbit.max_sum_contiguous_subarray;



public class MaxSumContiguousSubarray {

    public static void main(String[] args) {
     //int[] a =  {-2, 1, -3, 4, -1, 2, 1, -5, 4};
      int[] a =   {-3, -2, 0, -1};
        System.out.println("Max sum is : " + maxSum(a));
    }

    public static int maxSum(int[] a) {
        int maxSum = a[0];
        int currSum = 0;
        for (int i=0; i<a.length; i++) {
            currSum = currSum + a[i];
            if (currSum > maxSum)
                maxSum = currSum;
            if (currSum < 0)
                currSum = 0;
        }
        return maxSum;
    }

}
