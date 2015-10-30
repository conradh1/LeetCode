import java.util.*;

/*
See problem: https://leetcode.com/problems/repeated-dna-sequences/
*/
class Permutations
{
   static List<List<Integer>> pList = new ArrayList<List<Integer>>();
      
   public static List<List<Integer>> permute(int[] nums) {      
      int size = nums.length;
      
      return pList;
   }
    public static void permute(int nums[], int i, int n) {
      int j;
      if (i == n-1) {
         List<Integer> temp = new ArrayList<>();
         for(int num : nums) {
          temp.add(num);
         }
        pList.add(temp);
      }
      else
      {
        for (j = i; j < n; j++) {
          swap(nums,i, j);
          permute(nums, i+1, n);
          swap(nums,i, j); //backtrack
        }
      }
   }
  
   private static void swap (int array[], int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
   }
   
  public final static void main(String S[]) {
    int[] input = {1,2,3};
    
    permute(input, 0, input.length);    
    //permute(input);
  }
    
}
