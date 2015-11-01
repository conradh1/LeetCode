import java.util.*;

/*
See problem: https://leetcode.com/problems/find-the-duplicate-number/
*/
class DuplicateNumber
{

   public static int findDuplicate(int[] nums) {

      int[] sort = new int[nums.length+1];
      sort[0] = 0;
      for (int i = 0; i < nums.length; i++) {
	if ( sort[nums[i]+1] == 0 ) {
	  sort[nums[i]+1] = nums[i];
	}
	else if ( sort[nums[i]+1] == nums[i]) {
	  return nums[i];
	}
      }
      //System.out.println("debug"+Arrays.toString(sort));
      return -1;
   }

public final static void main(String S[]) {
    int[] input = {2,1,4,3,4,5};
    System.out.println(findDuplicate(input));
  }
}
