import java.util.Scanner;


abstract class FilmMember {
    abstract void work();
}


public class members extends FilmMember {

   
    private String actor;
    private String director;
    private String crew;
    private String scene;
    private int schedule;

    public members(String actor, String director, String crew, String scene, int schedule) {
        this.actor = actor;
        this.director = director;
        this.crew = crew;
        this.scene = scene;
        this.schedule = schedule;
    }

    
    @Override
    public void work() {
        System.out.println("\nActor: " + actor);
        System.out.println("Director: " + director);
        System.out.println("Crew: " + crew);
        System.out.println("Scene: " + scene);
        System.out.println("Schedule: " + schedule);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter actor: ");
        String actor = input.nextLine();

        System.out.print("Enter director: ");
        String director = input.nextLine();

        System.out.print("Enter crew: ");
        String crew = input.nextLine();

        System.out.print("Enter scene: ");
        String scene = input.nextLine();

        System.out.print("Enter filming schedule: ");
        int schedule = input.nextInt();

        members film = new members(actor, director, crew, scene, schedule);

        film.work();
    }
}