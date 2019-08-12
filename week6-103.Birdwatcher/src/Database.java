
import java.util.ArrayList;

public class Database {
    private ArrayList<Bird> birds;
    private ArrayList<Observation> observations;
    private ArrayList<String> commands;
    
    public Database() {
        birds = new ArrayList<Bird>();
        observations = new ArrayList<Observation>();
        commands = new ArrayList<String>();
        commands.add("Add");
        commands.add("Observation");
        commands.add("Statistics");
        commands.add("Show");
        commands.add("Quit");
    }
    
    public void add(Bird bird) {
        birds.add(bird);
    }
    
    public void add(Observation observation) {
        /*
        for (Bird bird : birds) {
            if (searchTerm(bird.getName(), observation.getBird().getName())) {
            } 
        }
        */
    }

    public ArrayList<String> getCommands() {
        return commands;
    }
    
    public ArrayList<Bird> getBirds() {
        return birds;
    }
    
    public ArrayList<Observation> getObservations() {
        return observations;
    }
    
}
