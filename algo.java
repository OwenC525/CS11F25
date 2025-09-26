public class algo {
    
    public static void main(String[] args){

        /*double hoursWorked = Double.parseDouble(args[0]);
        double ratePerHour = Double.parseDouble(args[1]);
        if (hoursWorked < 0 || ratePerHour < 0)
            System.out.println("error");
        else{
            double totalPay = hoursWorked * ratePerHour;
            System.out.println(totalPay);
        }*/
    
        /*int i = Integer.parseInt(args[0]);
        int v = 1;

        for (int i = 0; i <= n; i++){
            System.out.println(v);
            v = 2*v;
        }*/

        /*for (int i = 1; i <= 5; i++){
            for (int j=1; j <= 4; j++){
                System.out.print(i*j + " ");
            }
            System.out.println();
        }*/

        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }


    }
}
