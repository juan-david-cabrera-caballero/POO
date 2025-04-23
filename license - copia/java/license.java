public abstract class license {
    private final String name;
    private final String duration;
    private final double cost;

    public license(String name, String duration, double cost) {
        this.name = name;
        this.duration = duration;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getDuration() {
        return duration;
    }

    public double getCost() {
        return cost;
    }

    public abstract double CalculateCost();
}