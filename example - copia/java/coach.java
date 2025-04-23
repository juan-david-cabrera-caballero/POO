public class coach extends person {
    private int valueDays;
    private int numDays;
    private int totalClients;
    private final health healthDeduction;
    private final pension pensionDeduction;
    private final arl arlDeduction;

    public coach(int identification, String job, int transport, int valueDays, int numDays) {
        super(identification, job, transport);
        this.valueDays = valueDays;
        this.numDays = numDays;
        this.totalClients = 0;
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

    public int getTotalClients() {
        return totalClients;
    }

    public void setTotalClients(int totalClients) {
        this.totalClients = totalClients;
    }

    public void addClient() {
        this.totalClients++;
    }

    public double calculateBaseSalary() {
        return (this.valueDays * this.numDays) + (100 * this.totalClients);
    }

    public double calculateDeductions(double salary) {
        return this.healthDeduction.discounts(salary) +
               this.pensionDeduction.discounts(salary) +
               this.arlDeduction.discounts(salary);
    }
}