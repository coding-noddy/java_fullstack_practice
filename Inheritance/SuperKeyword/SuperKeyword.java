public class SuperKeyword {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        BankAccount sa = new SavingsAccount();
        BankAccount psa = new PremiumSavingsAccount();

        System.out.println(ba.calculateInterest(1000));
        System.out.println(sa.calculateInterest(1000));
        System.out.println(psa.calculateInterest(1000));
    }
}

class BankAccount {
    public double calculateInterest(int loanAmount) {
        return loanAmount * 0.035;
    }

}

class SavingsAccount extends BankAccount {
    public double calculateInterest(int loanAmount) {
        return loanAmount * 0.055;
    }
}

class PremiumSavingsAccount extends SavingsAccount {
    public double calculateInterest(int loanAmount) {
        double calculatedAmount = super.calculateInterest(loanAmount);
        return calculatedAmount + calculatedAmount * 0.01;
    }
}
