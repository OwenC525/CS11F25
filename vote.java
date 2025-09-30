public class vote {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        boolean canVote = (age >= 18);
        System.out.println(canVote);
    }
}
