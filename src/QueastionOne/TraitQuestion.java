package QueastionOne;

public class TraitQuestion {
    String label;
    Class<?> traitInterface;

    public TraitQuestion(String label, Class<?> traitInterface) {
        this.label = label;
        this.traitInterface = traitInterface;
    }

    public String toString() { return label; }
}
