package leetCode;

public class Problem492 {
    public int[] constructRectangle(int area) {
        int w = (int)Math.sqrt(area);
        while (area%w!=0){
            --w;
        }
        return new int[]{area/w,w};
    }
}
