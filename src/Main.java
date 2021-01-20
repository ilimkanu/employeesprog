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
        specialistBob.print();
        specialistBob.workWithClients();
        specialistBill.print();
        specialistBill.workWithClients();

        developerScott.print();
        developerScott.writeCode();
        developerNakaru.print();
        developerNakaru.writeCode();
        developerMike.print();
        developerMike.writeCode();
        developerAzamat.print();
        developerAzamat.writeCode();

        managerDonald.print();
        managerDonald.writeProcedures();
        managerNatasha.print();
        managerNatasha.writeProcedures();

        ceoSteve.print();
        ceoSteve.goPublic();
    }
}
