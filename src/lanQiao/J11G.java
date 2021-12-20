package lanQiao;

import java.util.Scanner;

public class J11G {
    static boolean isrun(int year){
        return ((year%4==0&&year%100!=0)||year%400==0);
    }

    static String trans(int year,int mon,int day){
        String ans="";
        ans=ans+(char)(year/1000+'0')+(char)(year%1000/100+'0')+(char)(year%100/10+'0')+(char)(year%10+'0');
        ans=ans+(char)(mon/10+'0')+(char)(mon%10+'0');
        ans=ans+(char)(day/10+'0')+(char)(day%10+'0');
        return ans;
    }

    static Boolean check1(String s){
        String re = new StringBuilder(s).reverse().toString();
        if (s.equals(re))
            return true;
        return false;
    }

    static Boolean check2(String s){
        if (s.charAt(0)==s.charAt(2)&&s.charAt(1)==s.charAt(3)&&s.charAt(0)!=s.charAt(1))
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int date = scan.nextInt();
        int year = date/10000;
        int mon = date/100 %100;
        int day = date%100;

        Boolean flag1= true, flag2 =true;
        String result1="", result2="";

        while (date<=89991231){
            day++;
            if (day==32&&mon==12){
                day = 1;
                mon=1;
                year++;
            }
            if (day==31&&(mon==4||mon==6||mon==9||mon==11)){
                day=1;
                mon++;
            }
            if (day==29&&mon==2&&!isrun(year)||(day==30&&mon==2&&isrun(year))){
                day=1;
                mon=3;
            }
            if(day==32&&(mon==1||mon==3||mon==5||mon==7||mon==8||mon==10)){
                day=1;
                mon++;
            }
            String str = trans(year,mon,day);
            if (check1(str)){
                if (flag1){
                    result1 = str;
                    flag1 =false;
                }
                if (flag2){
                    if (check2(str)){
                        result2 = str;
                        break;
                    }
                }
            }

        }

        System.out.println(result1);
        System.out.println(result2);

        scan.close();
    }
}
