public class Main {
    public static void main(String[] args) {
        Team barcelona = new Team("FC Barcelona");
        System.out.println("Team: " + barcelona.getName());
        
        Player matt = new Player("Matt", 50);
        barcelona.addPlayer(matt);
    }
}
