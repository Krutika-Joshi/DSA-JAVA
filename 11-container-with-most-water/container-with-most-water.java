class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int curr_area = 0;
        int left = 0;
        int right = height.length-1;

        while(left < right){
            curr_area = (right-left) * Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea,curr_area);

            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}