class Solution {
    public int singleNumber(int[] nums) {
        //init single variable
        int single = 0;
        
        for (int i = 0; i < nums.length; i++) {
            // XOR is applied cuz XOR between the same things will return 0 and 1 if they are different
            // So can use it to check the difference
            // This XOR will utilise "every element appears twice except for one." 
            // There is only 1 single, same things will be 0, then if 0 xor nums the result will be                 // nums.
                
            single = single ^ nums[i];
        }
        
        
        return single;
    }
}