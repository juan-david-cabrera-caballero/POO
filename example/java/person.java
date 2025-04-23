public class person {
    private int identification;
    private String job;
    private int transport;

    public person(int identification, String job, int transport) {
        this.identification = identification;
        this.job = job;
        this.transport = transport;
    }

    public int getIdentification() {
        return identification;
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getTransport() {
        return transport;
    }

    public void setTransport(int transport) {
        this.transport = transport;
    }
}