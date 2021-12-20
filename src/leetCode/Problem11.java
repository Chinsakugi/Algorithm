package leetCode;

public class Problem11 {
    public int maxArea(int[] height) {
        int n = height.length;
        int start = 0;
        int end  = n - 1;
        int max = 0;
        while (start<end){
            int h = Math.min(height[start],height[end]);
            max = Math.max(max,h * (end - start));
            if (height[start]<height[end]) {
                ++start;
            } else {
                --end;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Problem11 p = new Problem11();
        int[] num = {1,2,1};
        System.out.println(p.maxArea(num));
    }
}
