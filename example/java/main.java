// File: main.java

public class main {
    public static void main(String[] args) {
        Coach coach1 = new Coach(12345, "Entrenador de Fútbol", 50, 30, 20);
        coach1.addClient();
        coach1.addClient();
        System.out.println("Salario neto del entrenador: $" + coach1.salary());

        Supervisor supervisor1 = new Supervisor(67890, "Supervisor Deportivo", 100, 25, 20);
        supervisor1.setCoachComplete(true);
        System.out.println("Salario neto del supervisor: $" + supervisor1.salary());

        Administrator administrator1 = new Administrator(13579, "Administrador de Gimnasio", 80, 22, 15);
        System.out.println("Salario neto del administrador: $" + administrator1.salary());
    }
}

// File: Coach.java
class Coach {
    private final double baseSalary;
    private int clients;
    private final int ratePerClient;

    public Coach(int id, String title, double baseSalary, int clients, int ratePerClient) {
        this.baseSalary = baseSalary;
        this.clients = clients;
        this.ratePerClient = ratePerClient;
    }

    public void addClient() {
        clients++;
    }

    public double salary() {
        return baseSalary + (clients * ratePerClient);
    }
}

// File: Supervisor.java
class Supervisor {
    private final double baseSalary;
    private final int coaches;
    private final int ratePerCoach;
    private boolean coachComplete;

    public Supervisor(int id, String title, double baseSalary, int coaches, int ratePerCoach) {
        this.baseSalary = baseSalary;
        this.coaches = coaches;
        this.ratePerCoach = ratePerCoach;
        this.coachComplete = false;
    }

    public void setCoachComplete(boolean coachComplete) {
        this.coachComplete = coachComplete;
    }

    public double salary() {
        return baseSalary + (coaches * ratePerCoach) + (coachComplete ? 100 : 0);
    }
}

// File: Administrator.java
class Administrator {
    private final double baseSalary;
    private final int numDays;
    private final int ratePerDay;

    public Administrator(int id, String title, double baseSalary, int numDays, int ratePerDay) {
        this.baseSalary = baseSalary;
        this.numDays = numDays;
        this.ratePerDay = ratePerDay;
    }

    public double salary() {
        return baseSalary + (numDays * ratePerDay);
    }
}