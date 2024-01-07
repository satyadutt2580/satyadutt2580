class Program {

    public static void main(String[] args) {
        System.out.println("Welcome Investor!");
        double p = Double.parseDouble(args[0]);
        int n = Integer.parseInt(args[1]);
        System.out.printf("Total investment is %.2f%n", p * n);
        System.out.printf("Future value in risk-free investment: %.2f%n", Investment.futureValue(p, n, false));
        System.out.printf("Future value in low-risk investment: %.2f%n", Investment.futureValue(p, n, true));
    
    }
}
