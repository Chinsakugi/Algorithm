package lanQiao;

public class moniA {
    static public boolean f(int n){
        int x;
        while (n>0){
            x = n%10;
            if (x==0||x==1||x==2||x==9){
                return true;
            }
            n = n/10;
        }
        return false;
    }

    public static void main(String[] args) {
        long sum=0;
        for (int i=1;i<=2019;++i){
            if (f(i)){
                sum+=i*i;
            }
        }
        System.out.println(sum);
    }
}
