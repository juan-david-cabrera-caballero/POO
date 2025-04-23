public class user {
    private String name;
    private String lastName;
    private double weight;
    private double stature;
    private plan plan;

    public user(String name, String lastName, double weight, double stature) {
        this.name = name;
        this.lastName = lastName;
        this.weight = weight;
        this.stature = stature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getStature() {
        return stature;
    }

    public void setStature(double stature) {
        this.stature = stature;
    }

    public plan getPlan() {
        return plan;
    }

    public void setPlan(plan plan) {
        this.plan = plan;
    }
}