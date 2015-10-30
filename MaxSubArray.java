public class MaxSubArray {

  public static void main(String[] args) {
    // build the simple tree from chapter 11.
    int[] ar = {-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(maxSubArray(ar));
  }


  public static int maxSubArray(int[] nums) {
    int size = nums.length;
    int best_start_index = -1;
    int best_end_index = -1;
    int best_sum = Integer.MIN_VALUE;
    
    int current_index = 0;    
    int current_sum = 0;
    
    if ( size == 1 ) {
      return nums[0];
    }    
        
    for ( int i = 1; i < size; i++) {      
      int val = current_sum + nums[i];
      
       if ( val > best_sum  ) {
          if ( current_sum == 0)
            current_index = i;
          current_sum = val;
      }
      else 
        current_sum = 0;
      if ( current_sum > best_sum ) {
        best_sum = current_sum;
        best_start_index = current_index;
        best_end_index = i;
      }                
    }
    return best_sum;
  }

}
