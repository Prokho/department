public class Main {
    static void printOrganisation(Organisation organisation)
    {
        System.out.println("Director "+ organisation.getDirector().getName() +" "+organisation.getDirector().getSecondName());
    }
    public static void main(String[] args) {

        Person d = new Person("Oleg", "Nikolaev", 1955);
        Organisation vasilek = new Organisation(d);
        Department production = new Department("production");
        vasilek.addDepartment(production);
        Department accounting = new Department("accounting");
        vasilek.addDepartment(accounting);
        production.addPerson(d);
        production.addPerson(new Person("Kirill", "Afanasiev", 2001));
        accounting.addPerson(new Person("Natalia", "Veselova", 1985));
        accounting.addPerson(new Person("Olga", "Zolotova", 1999));
        printOrganisation(vasilek);
    }
}


