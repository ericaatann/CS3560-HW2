public class Employee {
    private String name;
    private int hours;

    public Employee(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    public double calculateSalary() {
        return hours * 20;
    }

    public class Professor extends Employee {
        private String field;

        public Professor(String name, int hours) {
            super(name, hours);
        }

        public double calculateSalary() {
            return hours * 30;
        }

    }

    public class Staff extends Employee {
        private int role;

        public Staff(String name, int hours) {
            super(name, hours);
        }

    }
}