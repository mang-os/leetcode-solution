import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // Sort both the greed factors and the cookie sizes
        Arrays.sort(g);
        Arrays.sort(s);
        
        int childIndex = 0;
        int cookieIndex = 0;
        
        // Iterate through both arrays
        while (childIndex < g.length && cookieIndex < s.length) {
            // If the current cookie is big enough for the current child
            if (s[cookieIndex] >= g[childIndex]) {
                childIndex++; // Move to the next child
            }
            cookieIndex++; // Always move to the next cookie
        }
        
        // childIndex represents the number of content children
        return childIndex;
    }
}