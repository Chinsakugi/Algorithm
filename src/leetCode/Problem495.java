package leetCode;

public class Problem495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (duration==0)
            return 0;
        int timeSum = 0;
        int n = timeSeries.length;
        for (int i=0;i<n-1;++i){
            if (timeSeries[i+1]-timeSeries[i]>=duration)
                timeSum += duration;
            else {
                timeSum += timeSeries[i+1]-timeSeries[i];
            }
        }
        timeSum += duration;
        return timeSum;
    }
}
