public class premium extends plan {
    public premium() {
        super("Premium", 120000, "General access + Directed classes + Personal trainer + Wet area");
    }

    @Override
    public String getServices() {
        return "General access + Directed classes + Personal trainer + Wet area";
    }
}