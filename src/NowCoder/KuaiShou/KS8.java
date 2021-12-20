package NowCoder.KuaiShou;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class KS8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        while ((1+i)*i/2 < n)
            ++i;
        System.out.println(i);
        String[] str = {"uoi","da"};
        List list = Arrays.asList(str);
        //str[0] = "adsf";
        list.add("asdf");
        System.out.println(list.get(0));
    }
}
