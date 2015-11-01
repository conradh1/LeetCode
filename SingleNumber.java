import java.util.*;

/*
See problem: https://leetcode.com/problems/repeated-dna-sequences/
*/
class SingleNumber
{
  public static int singleNumber(int[] nums) {
    int single = 0;
    int size = nums.length;
    boolean isFound = false;
    
    if ( size == 0)
      return -1;
    if ( size == 1)
      return nums[0];
    
    for (int i = 0; i < size; i++) {
      single ^= nums[i];
    }    
    return single;    
  }
   
  public final static void main(String S[]) {
    int[] input = {0,0,1,1,5};
    
    System.out.println(singleNumber(input));
    
    //permute(input);
  }
    
}
