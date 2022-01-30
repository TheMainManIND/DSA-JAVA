import java.io.*;
import java.util.*;

public class MisssingNumber {
	public static void main(String[] args) {
		int[] nums = {3,0,1};
		System.out.println(missingNumber(nums));
	}

	public static int missingNumber(int[] nums) {
        int n = nums.length;
        int TotalSum = (n*(n+1))/2;
        int sum = 0;
        for (int i=0;i<nums.length ;i++ ) {
        	sum+= nums[i];
        }
        return TotalSum-sum;
    }
}