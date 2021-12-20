package codeTest.Boke1102;

public class Problem4 {
    public String convertToTitle(int cn) {
        StringBuilder sb = new StringBuilder();
        while (cn > 0) {
            cn--;
            sb.append((char)(cn % 26 + 'A'));
            cn /= 26;
        }
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        Problem4 problem4 = new Problem4();
        System.out.println(problem4.convertToTitle(78) );
    }
}
