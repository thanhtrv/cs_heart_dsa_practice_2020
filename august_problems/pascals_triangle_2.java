class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> re = new ArrayList();
        for(int i = 0;i<rowIndex+1;++i)
            re.add(1);
        
        
        
        // row
        for(int i = 1; i < rowIndex; ++i) {
            for(int j = i; j>0; --j) {
                
                re.set(j, re.get(j) + re.get(j-1));
                
            }
             
            
            
        }
        
        
        return re;
        
        
    }
}
