public class Worker {
    private String name;
    private double hourlyRate;

    public Worker(String nme, double hourlyRate){
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    public class Payroll{
        public void processPayments(Worker worker){
            System.out.println("Payment processed for worker " + worker);
        }
    }
}
