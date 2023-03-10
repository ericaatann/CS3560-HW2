public class Worker {
    private String name;
    private double hourlyRate;

    public Worker(String name, double hourlyRate){
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    public String getName(){
        return name;
    }

    public class Payroll{
        public static void processPayments(Worker worker){
            System.out.println("Payment processed for worker " + worker.getName());
        }
    }
}
