import java.util.Scanner;


abstract class Laboratory {
    abstract void showExperiment();
}


class vslab extends Laboratory {

    
    private String studentName;
    private String experimentName;
    private String reactionType;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setExperimentName(String experimentName) {
        this.experimentName = experimentName;
    }

    public String getExperimentName() {
        return experimentName;
    }

    public void setReactionType(String reactionType) {
        this.reactionType = reactionType;
    }

    public String getReactionType() {
        return reactionType;
    }

   
    @Override
    void showExperiment() {
        System.out.println("\n--- VIRTUAL LAB ---");
        System.out.println("Student: " + studentName);
        System.out.println("Experiment: " + experimentName);
        System.out.println("Type: " + reactionType);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        vslab lab = new vslab();

        System.out.print("Enter student name: ");
        lab.setStudentName(input.nextLine());

        System.out.println("\nChoose an experiment:");
        System.out.println("1. Mixing Vinegar and Baking Soda");
        System.out.println("2. Melting Ice");
        System.out.println("3. Dissolving Salt in Water");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        if (choice == 1) {
            lab.setExperimentName("Mixing Vinegar and Baking Soda");
            lab.setReactionType("Chemical Reaction");
        } 
        else if (choice == 2) {
            lab.setExperimentName("Melting Ice");
            lab.setReactionType("Physical Change");
        } 
        else if (choice == 3) {
            lab.setExperimentName("Dissolving Salt in Water");
            lab.setReactionType("Physical Change");
        }

        lab.showExperiment();
    }
}