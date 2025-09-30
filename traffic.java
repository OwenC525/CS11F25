public class traffic {
    public static void main(String[] args) {
        int speed = Integer.parseInt(args[0]);
        if (speed < 60) {
            System.out.println("$0, display a warning");
        }
            else if (speed <= 75) {
                System.out.println("100 fine");
            }
            else if (speed <= 90) {
                System.out.println("$200 fine");
            }
            else {
                System.out.println("$500 fine");
            }
        
    }
}
