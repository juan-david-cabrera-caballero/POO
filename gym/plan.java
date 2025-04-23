public abstract class plan {
    protected String name;
    protected double cost; 
    private final String service;

    public plan(String name, double cost, String service) {
        this.name = name;
        this.cost = cost;
        this.service = service;
    }

    public String getName() {
        return name;
    }

    public double getCost() { 
        return cost;
    }

    public String getService() {
        return service;
    }

    public abstract String getServices();
}