public class Specialist extends Employee {
    private int levels;

    public Specialist(String fio, int age, int salary, int levels) {
        super(fio, age, salary);
        this.levels = levels;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(levels);
    }

    public void workWithClients(){
        System.out.println("I am working with our clients!");
    }
}
