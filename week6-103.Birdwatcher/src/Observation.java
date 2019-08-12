public class Observation {
    private int observations;
    private Bird bird;
    
    public Observation(Bird bird, int observations) {
        this.observations = observations;
        this.bird = bird;
    }

    public int getObservations() {
        return observations;
    }

    public Bird getBird() {
        return bird;
    }

    public void setObservations(int observations) {
        this.observations = observations;
    }

    public void setBird(Bird bird) {
        this.bird = bird;
    }
    
    @Override
    public String toString() {
        return bird.toString()+": "+observations+" observations";
    }
}
