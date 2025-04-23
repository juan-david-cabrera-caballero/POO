public class administrator extends person {
    private int valueDays;
    private int numDays;
    private final health healthDeduction;
    private final pension pensionDeduction;
    private final arl arlDeduction;

    public administrator(int identification, String job, int transport, int valueDays, int numDays) {
        super(identification, job, transport);
        this.valueDays = valueDays;
        this.numDays = numDays;
        this.healthDeduction = new health();
        this.pensionDeduction = new pension();
        this.arlDeduction = new arl();
    }

    public int getValueDays() {
        return valueDays;
    }

    public void setValueDays(int valueDays) {
        this.valueDays = valueDays;
    }

    public int getNumDays() {
        return numDays;
    }

    public void setNumDays(int numDays) {
        this.numDays = numDays;
    }

    public float calculateBaseSalary() {
        return 1200 + (this.valueDays * this.numDays);
    }

    public float calculateDeductions(float salary) {
        return (float) (this.healthDeduction.discounts(salary) +
                this.pensionDeduction.discounts(salary) +
                this.arlDeduction.discounts(salary));
    }
}
