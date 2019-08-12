
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Database database = new Database();
        String command = "";

        do {
            System.out.print("? ");
            command = scanner.nextLine();

            if (!run(command)) {
                continue; //Skip below code
            }

            if (StringUtils.included("Add", command)) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Latin Name: ");
                String latinName = scanner.nextLine();

                database.add(new Bird(name, latinName));

            } else if (StringUtils.included("Observation", command)) {
                System.out.println("What was observed:? ");
                String birdName = scanner.nextLine();

                Bird birdInDatabase = null;
                boolean birdFound = false;
                for (Bird bird : database.getBirds()) {
                    if (StringUtils.included(bird.getName(), birdName)) {
                        birdFound = true;
                        birdInDatabase = bird;
                    }
                }

                if (birdFound) {
                    boolean birdSeenBefore = false;
                    for (Observation observation : database.getObservations()) {
                        if (StringUtils.included(observation.getBird().getName(), birdInDatabase.getName())) {
                            birdSeenBefore = true;
                            observation.setObservations(observation.getObservations() + 1);
                        }
                    }

                    if (!birdSeenBefore) {
                        database.getObservations().add(new Observation(birdInDatabase, 1));
                        //database.add(new Observation(birdInDatabase, 1)); 
                        //System.out.println("New OBSERVATION ADDED TO LIST");
                    }
                } else {
                    System.out.println("Is not a bird!");
                }

            } else if (StringUtils.included("Statistics", command)) {
                for (Observation observation : database.getObservations()) {
                    System.out.println(observation);
                }
            } else if (StringUtils.included("Show", command)) {
                System.out.print("What? ");
                String birdName = scanner.nextLine();

                boolean observed = false;
                for (Observation observation : database.getObservations()) {
                    if (StringUtils.included(observation.getBird().getName(), birdName)) {
                        System.out.println(observation);
                        observed = true;
                    }
                }

                if (!observed) {
                    for (Bird bird : database.getBirds()) {
                        if (StringUtils.included(bird.getName(), birdName)) {
                            System.out.println(bird+": 0 observations");
                        }
                    }
                }
            }

        } while (run(command));
    }

    public static boolean run(String command) {
        if (StringUtils.included("Quit", command)) {
            return false;
        }
        return true;
    }
}
