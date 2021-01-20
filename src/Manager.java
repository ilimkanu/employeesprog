public class Manager extends Employee {
    private boolean hasStocks;

    public Manager(String fio, int age, int salary, boolean hasStocks) {
        super(fio, age, salary);
        this.hasStocks = hasStocks;
    }

    public boolean isHasStocks() {
        return hasStocks;
    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(hasStocks);
    }

    public void writeProcedures(){
        System.out.println("I am making procedures!");
    }
}
