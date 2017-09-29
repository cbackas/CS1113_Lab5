// Zachary Gibson
// 60975

package cback;

public class SavingsAccount {
    private String accountOwner;
    private double accountBalance;

    private static double lowInt;
    private static double highInt;

    public SavingsAccount(String ownerName, double initialBal) {
        this.accountOwner = ownerName;
        this.accountBalance = initialBal;
    }


    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getInterestRate() {
        if (this.accountBalance >= 1000) {
            return highInt;
        } else {
            return lowInt;
        }
    }

    public static double getLowInt() {
        return lowInt;
    }

    public static void setLowInt(double lowInt) {
        lowInt = lowInt;
    }

    public static double getHighInt() {
        return highInt;
    }

    public static void setHighInt(double highInt) {
        highInt = highInt;
    }
}
