public class movie {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n < 0) {
            System.out.println("error");
        }
        if (n <= 4) {
            System.out.println("Horrible!");
        }
    }
}
