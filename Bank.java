public class Bank {
    private String holder;
    private double balance;
    public Bank(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    } 
    public void setbalance(double balance) {
        if(balance<0){
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance = balance;
        
    }
    public double getbalance(){
        return balance;
    }
    public void setholder(String holder) {
        this.holder = holder;
    }
    public String getholder() {
        return holder;
    }
    public static void main(String[] args) {
        Bank b1 = new Bank("Rohit", 1000);
        System.out.println("Account Holder: " + b1.getholder());
        System.out.println("Account Balance: " + b1.getbalance());
        b1.setbalance(-1500);
        System.out.println("Updated Account Balance: " + b1.getbalance());
        b1.setbalance(900);
        System.out.println("Updated Account Balance: " + b1.getbalance());
    }
} 
















// i added 2 numbers 0.1 nadd 0.2 in ouble or float it will give 0.30000000000000004 but if we add in BigDecimal it will give 0.3 why? because BigDecimal is used for precise calculations and avoids the floating-point precision issues that can occur with double or float types. but 