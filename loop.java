public class loop {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int i = 1;
        if (n < i) {
            System.out.println("error");
        }
        while (i <=n) {
            System.out.println(i + ",");
            i = i + 1;
        }
    }
}
