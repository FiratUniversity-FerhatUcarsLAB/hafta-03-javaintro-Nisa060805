public class Faktoriyel {
    public static void main(String[] args) {
        int n = 5;
        int faktoriyel = 1;
        for (int i = 1; i <= n; i++) {
            faktoriyel *= i;
            System.out.println(i + "! = " + faktoriyel);
        }
    }
}
