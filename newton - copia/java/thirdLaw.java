class thirdLaw extends law {

    public thirdLaw() {
        super("Third Law of Motion");
    }
    
    public void explain() {
        System.out.println("3rd Law: For every action, there is an equal and opposite reaction.");
    }

    @Override
    public void calculate() {
        System.out.println("No calculation required. The principle applies directly.");
    }

    public void calculatedLaw() { // Ensure the method signature matches the abstract method in the parent class
        System.out.println("This is the implementation of the calculatedLaw method.");
    }
}
