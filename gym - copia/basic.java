public class basic extends plan {
    public basic() {
        super("Básic", 20000, "general Access");
    }

    
    @Override
    public String getServices() {
        return "general Access";
    }
}