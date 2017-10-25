import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    /**
     * Created enums for BankAccount.
     */
    public enum BankAccountType {
        /**
         * Checkings is an enum.
         */
        CHECKINGS,
        /**
         * Savings is an enum.
         */
        SAVINGS,
        /**
         * Student is an enum.
         */
        STUDENT,
        /**
         * Workplace is an enum.
         */
        WORKPLACE
    }
    /**
     * accountNumber is an int.
     */
    private int accountNumber;
    /**
     * accountType is an object of BankAccountType.
     */
    public BankAccountType accountType;
    /**
     * accountBalance is a double.
     */
    private double accountBalance;
    /**
     * ownerName is a string.
     */
    private String ownerName;
    /**
     * interestRate is a double.
     */
    public double interestRate;
    /**
     * interestEarned is a double.
     */
    private double interestEarned;

    /**
     * BankAccount constructor.
     * @param name is a String.
     * @param accountCategory is a BankAccountType.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
    }
    /**
     * getAccountNumber gets the accountNumber.
     * @return the accountNumber.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * setAccountNumber sets the accountNumber.
     * @param accountNumber is an int.
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
}