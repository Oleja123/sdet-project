package helicopters.supportive;

public class Cargo {
    private int weight;

    private String name;

    public Cargo(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public int getWeight(){
        return weight;
    }

    public String getName(){
        return name;
    }
}
