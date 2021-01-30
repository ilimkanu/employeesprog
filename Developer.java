public class Developer extends Employee {
    private String ranks;

    public Developer(String fio, int age, int salary, String ranks) {
        super(fio, age, salary);
        this.ranks = ranks;
    }

    public String getRanks() {
        return ranks;
    }

    public void setRanks(String ranks) {
        this.ranks = ranks;
    }

    @Override
    public void print() {
        System.out.println(ranks);
    }
    public void goToDayOff() {
        System.out.println("I am sick");
    }

    public void writeCode(){
        System.out.println("I am writing my algorithm!");
    }
}
