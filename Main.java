import childs.Ceo;
import childs.Developer;
import childs.Specialist;
import parent.Manager;

public class Main {
    public static void main(String[] args){
        Specialist specialistMax = new Specialist("Max", 29, 50000, 2);
        Specialist specialistBob = new Specialist("Bob", 32, 60000, 4);
        Specialist specialistBill = new Specialist("Bill", 28, 52000, 2);
        Developer developerScott = new Developer("Scott", 27, 60000, "JavaDeveloper");
        Developer developerNakaru = new Developer("Nakaru", 34, 70000, "C++Developer");
        Developer developerMike = new Developer("Mike", 32, 70000, "PythonDeveloper");
        Developer developerAzamat = new Developer("Azamat", 25, 55000, "JavaScriptDeveloper");
        Manager managerDonald = new Manager("Donald", 37, 80000, false);
        Manager managerNatasha = new Manager("Natasha", 28, 70000, true);
        Ceo ceoSteve = new Ceo("Steve", 38, 100000, true, true);

        specialistMax.print();
        specialistMax.workWithClients();
        specialistMax.goToDayOff();
        specialistBob.print();
        specialistBob.workWithClients();
        specialistBob.goToDayOff();
        specialistBill.print();
        specialistBill.workWithClients();
        specialistBill.goToDayOff();

        developerScott.print();
        developerScott.writeCode();
        developerScott.goToDayOff();
        developerNakaru.print();
        developerNakaru.writeCode();
        developerNakaru.goToDayOff();
        developerMike.print();
        developerMike.writeCode();
        developerMike.goToDayOff();
        developerAzamat.print();
        developerAzamat.writeCode();
        developerAzamat.goToDayOff();

        managerDonald.print();
        managerDonald.writeProcedures();
        managerDonald.goToDayOff();
        managerNatasha.print();
        managerNatasha.writeProcedures();
        managerNatasha.goToDayOff();

        ceoSteve.print();
        ceoSteve.goPublic();
        ceoSteve.goToDayOff();
    }
}
