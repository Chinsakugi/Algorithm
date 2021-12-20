package LeetcodeTop;

public class T134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int i = 0;
        while (i < n){
            int sumOfGas = 0, sumOfCost = 0;
            int cnt = 0;
            while (cnt < n){
                int j = (i + cnt) % n;
                sumOfGas += gas[j];
                sumOfCost += cost[j];
                if (sumOfCost > sumOfGas)
                    break;
                cnt++;
            }
            if (cnt==n)
                return i;
            else
                i = i +cnt + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        T134 solution = new T134();
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(solution.canCompleteCircuit(gas,cost));
    }
}
