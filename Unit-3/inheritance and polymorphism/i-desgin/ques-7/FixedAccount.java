public class FixedAccount extends SavingAccount {
    private int lockingPeriod;

    public void setLockingperoid(int lockingPeriod) {
        this.lockingPeriod = lockingPeriod;
    }

    public int getlocking() {
        return lockingPeriod;
    }
}
