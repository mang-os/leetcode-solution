class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        
        // Avoid infinite recursion if the new color is the same as the original
        if (originalColor != color) {
            dfs(image, sr, sc, originalColor, color);
        }
        
        return image;
    }
    
    private void dfs(int[][] image, int r, int c, int originalColor, int newColor) {
        // Check for out of bounds or if the current pixel is not the original color
        if (r < 0 || r >= image.length || c < 0 || c >= image[0].length || image[r][c] != originalColor) {
            return;
        }
        
        // Update the current pixel's color
        image[r][c] = newColor;
        
        // Recurse in all 4 directions
        dfs(image, r - 1, c, originalColor, newColor); // Up
        dfs(image, r + 1, c, originalColor, newColor); // Down
        dfs(image, r, c - 1, originalColor, newColor); // Left
        dfs(image, r, c + 1, originalColor, newColor); // Right
    }
}