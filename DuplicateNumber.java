import java.util.*;

/*
See problem: https://leetcode.com/problems/repeated-dna-sequences/
*/
class DuplicateNumber
{
  public static int duplicateNumber(int[] nums) {
    int dup = 0;
    int iSum = 0;
    int aSum = 0;
    int size = nums.length;
    if ( size == 0)
      return -1;
    if ( size == 1)
      return nums[0];
    
    for (int i = 0; i < size; i++) {        
        iSum += i+1;
        aSum += nums[i];
    }        
    dup = aSum^iSum;
    System.out.println("i "+iSum+" num: "+aSum);
    return dup;
  }
   
  public final static void main(String S[]) {
    int[] input = {1,2,3,4,11};
    
    System.out.println(duplicateNumber(input));
    
    //permute(input);
  }
    
}
