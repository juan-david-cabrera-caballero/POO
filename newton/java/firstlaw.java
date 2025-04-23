class firstlaw extends law {

    public firstlaw() {
        super("First Law of Motion");
    }
    
    public void explain() {
        System.out.println("1st Law: If the net force is 0, the object maintains its state (rest or constant motion).");
    }

    @Override
    public void calculate() {
        System.out.println("No calculation needed because force equals 0.");
    }

    public double calculateLaw() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateLaw'");
    }
}


