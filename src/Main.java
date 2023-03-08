public class Main {
    public static void main(String[] args) {
        int a1 = 100;
        System.out.println("Summada " + boluu(a1));
    }

    public static int boluu(int a) {
        int sum = 0;
        for (int i = 0; i <= a; i++) {
            if (i % 3 == 0) {
                sum += i;
                System.out.println(i + " 3 bolunot");
            } else if (i % 4 == 0) {
                sum += i;
                System.out.println(i + " 4 bolunot");
            } else if (i % 5 == 0) {
                sum += i;
                System.out.println(i + " 5 bolunot");
            }
        }
        return sum;
    }
}