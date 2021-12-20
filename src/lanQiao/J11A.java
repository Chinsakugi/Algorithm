package lanQiao;

public class J11A {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1;i<=2020;++i){
            sum+=findTwo(i);
        }
        System.out.println(sum);
    }

    static int findTwo(int num){
        int sum = 0;
        while (num!=0){
            int i = num%10;
            if (i==2)
                ++sum;
            num /= 10 ;
        }
        return sum;
    }
}
