public abstract class law {
    private String name;

    // Parameterized constructor
    public law(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Abstract method to be implemented by subclasses
    public abstract void calculate();
    
    @Override
    public String toString() {
        return "Law: " + name;
    }
}
