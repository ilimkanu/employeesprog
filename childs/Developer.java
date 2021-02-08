package childs;

import parent.Employee;
import parent.Ranksenum;

public class Developer extends Employee {
    private static Ranksenum gradesen;
    private String ranks;

    public static Ranksenum getGradesen() {
        return gradesen;
    }

    public Developer(String fio, int age, int salary, String ranks, Ranksenum gradesen) {
        super(fio, age, salary);
        this.ranks = ranks;
        Developer.gradesen = gradesen;
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

    public void writeCode() {
        System.out.println("I am writing my algorithm!");
    }
}
