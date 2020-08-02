class Solution {
  
    
    
    public int maxSubArray(int[] nums) {
        int current_max = nums[0], global_max = nums[0];
        
        for (int i = 1; i <= nums.length - 1; i++) {
            
//             calculate current max then update it after comparing with the previous current_max
            current_max = Math.max(nums[i], current_max + nums[i]);
            
//             update the global if the local/current max is bigger than ...
            if (current_max > global_max) {
                global_max = current_max;
            }
            
            
        }
        
        return global_max;
        
    }
    
}
    
        
//         return global_max;
    // int maxSoFar=nums[0], maxEndingHere=nums[0];
    // for (int i=1;i<nums.length;++i){
    // 	maxEndingHere= Math.max(maxEndingHere+nums[i],nums[i]);
    // 	maxSoFar=Math.max(maxSoFar, maxEndingHere);	
    // }
    // return maxSoFar;
        
    
// }
