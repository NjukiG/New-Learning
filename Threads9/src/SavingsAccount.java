class SavingsAccount {

    private long total = 0;

    public boolean withdraw(long amount) {
        if(amount <= total){
            total -= amount;
        }
        return true;

    }

    public void deposit(long amount) {
        total += amount;

    }

    public long getTotal() {
        return total;
    }
}