import java.util.*;

/*
See problem: https://leetcode.com/problems/repeated-dna-sequences/
*/
class MissingNumbers
{
  public static int missingNumber(int[] nums) {
    
    int sum = nums.length;
    for (int i = 0; i < nums.length; i++) {
        sum += i - nums[i];
    }
    return sum;
  }
   
  public final static void main(String S[]) {
    int[] input = {0,1,2,3,5};
    
    System.out.println(missingNumber(input));
    
    //permute(input);
  }
    
}
