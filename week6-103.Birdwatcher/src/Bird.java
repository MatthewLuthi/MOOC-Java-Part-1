public class Bird {
    private String name;
    private String latinName;

    public Bird() {
        name = "UNKOWN";
        latinName = "UNKOWN";
    }

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }
    
    @Override
    public String toString() {
        return name+" ("+latinName+")";
    }
}
