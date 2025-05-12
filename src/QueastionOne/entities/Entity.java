package QueastionOne.entities;

public abstract class Entity {
    public abstract String getName();

    public boolean hasTrait(Class<?> trait) {
        return trait.isInstance(this);
    }
}
