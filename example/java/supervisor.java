public class supervisor extends person {
    private int valueDays;
    private int numDays;
    private boolean coachComplete;
    private final health healthDeduction;
    private final pension pensionDeduction;
    private final arl arlDeduction;

    public supervisor(int identification, String job, int transport, int valueDays, int numDays) {
        super(identification, job, transport);
        this.valueDays = valueDays;
        this.numDays = numDays;
        this.coachComplete = false;
        this.healthDeduction = new health();
        this.pensionDeduction = new pension();
        this.arlDeduction = new arl();
    }

    public supervisor(arl arlDeduction, health healthDeduction, pension pensionDeduction, int identification, String job, int transport) {
        super(identification, job, transport);
        this.arlDeduction = arlDeduction;
        this.healthDeduction = healthDeduction;
        this.pensionDeduction = pensionDeduction;
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

    public boolean isCoachComplete() {
        return coachComplete;
    }

    public void setCoachComplete(boolean coachComplete) {
        this.coachComplete = coachComplete;
    }

    public double calculateBaseSalary() {
        double baseSalary = 1500;
        return baseSalary + (this.valueDays * this.numDays) + (this.coachComplete ? 200 : 0);
    }

    public double calculateDeductions(double salary) {
        return this.healthDeduction.discounts(salary) +
               this.pensionDeduction.discounts(salary) +
               this.arlDeduction.discounts(salary);
    }

}