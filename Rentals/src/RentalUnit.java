public class RentalUnit {
    private String address;
    private int monthlyRate;
    private boolean petAllowed;
    private int minimumMonths;


    public RentalUnit(String add, int rentAmt, boolean allowPet, int leaseLength) {
        this.address = add;
        this.monthlyRate = rentAmt;
        this.petAllowed = allowPet;
        this.minimumMonths = leaseLength;

    }

    public String getAddress() {
        return address;
    }

    public int getMonthlyRate() {
        return monthlyRate;
    }

    public boolean isPetAllowed() {
        return petAllowed;
    }

    public int getMinimumMonths() {
        return minimumMonths;
    }
}
