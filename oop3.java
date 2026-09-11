import java.util.Scanner;


abstract class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void showRole();
}


class Detective extends Person {

    @Override
    void showRole() {
        System.out.println(getName() + " is the Detective.");
    }
}

class Witness extends Person {

    @Override
    void showRole() {
        System.out.println(getName() + " is the Witness.");
    }
}

class Suspect extends Person {

    @Override
    void showRole() {
        System.out.println(getName() + " is the Suspect.");
    }
}


class Evidence {
    private String description;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}


class Investigation {
    private String caseName;
    private String status;

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}


public class MysteryCase {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Detective detective = new Detective();
        Witness witness = new Witness();
        Suspect suspect = new Suspect();
        Evidence evidence = new Evidence();
        Investigation investigation = new Investigation();

        System.out.print("Enter case name: ");
        investigation.setCaseName(input.nextLine());

        System.out.print("Enter detective name: ");
        detective.setName(input.nextLine());

        System.out.print("Enter witness name: ");
        witness.setName(input.nextLine());

        System.out.print("Enter suspect name: ");
        suspect.setName(input.nextLine());

        System.out.print("Enter evidence: ");
        evidence.setDescription(input.nextLine());

        investigation.setStatus("Ongoing");

        System.out.println("\n--- CASE INFORMATION ---");
        System.out.println("Case: " + investigation.getCaseName());
        System.out.println("Detective: " + detective.getName());
        System.out.println("Witness: " + witness.getName());
        System.out.println("Suspect: " + suspect.getName());
        System.out.println("Evidence: " + evidence.getDescription());
        System.out.println("Status: " + investigation.getStatus());

        detective.showRole();
        witness.showRole();
        suspect.showRole();
    }
}