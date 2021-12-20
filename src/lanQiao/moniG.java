package lanQiao;

import java.util.*;

public class moniG {
    public static void main(String[] args) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int t = scanner.nextInt();

        int ts,id;
        for (int i=0;i<m;++i){
            ts= scanner.nextInt();
            id = scanner.nextInt();
            if (!map.containsKey(ts)){
                List<Integer> arr = new ArrayList<>();
                arr.add(id);
                map.put(ts,arr);
            }
            else{
                map.get(ts).add(id);
            }
        }

        int[] level = new int[2];
        Arrays.fill(level,0);
        for (int no=0;no<n;++no){
            for (int i=1;i<=t;++i){
                int temp = 0;
                if (map.containsKey(i)) {
                    for (int j = 0; j < map.get(i).size(); ++j) {
                        if (map.get(i).get(j)-1 == no) {
                            temp++;
                        }
                    }
                }
                if (temp>0){
                    level[no]+=(2*temp);
                }
                else if(temp==0&&level[no]>1){
                    level[no]--;
                }
            }
        }
        int count = 0;
        for (int score : level){
            if (score>5){
                count++;
            }
        }
        System.out.println(count);

    }
}
