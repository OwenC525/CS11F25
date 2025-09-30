public class pyramid {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int i = 1;
        while (i <= n) {
            String j = "*";
            System.out.println(j);
            j = j + "*";
            i = i + 1;
        }
        while (i >= 1) {
            String j = "*";
            System.out.println(j);
            j = j + "*";
            i = i - 1;
        }
    }
}
