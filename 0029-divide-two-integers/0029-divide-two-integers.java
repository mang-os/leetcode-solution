class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        
        if (dividend > 0) dividend = -dividend;
        if (divisor > 0) divisor = -divisor;
        
        int quotient = 0;
        
        while (dividend <= divisor) {
            int temp = divisor;
            int count = -1; 
            
            while (temp >= (Integer.MIN_VALUE >> 1) && dividend <= (temp << 1)) {
                temp <<= 1;
                count <<= 1;
            }
            
            dividend -= temp;
            quotient += count;
        }
        
        return isNegative ? quotient : -quotient;
    }
}