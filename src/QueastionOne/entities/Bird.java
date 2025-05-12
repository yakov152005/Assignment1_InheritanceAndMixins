package QueastionOne.entities;

import QueastionOne.traits.CanFly;
import QueastionOne.traits.HasFeathers;
import QueastionOne.traits.HasWings;
import QueastionOne.traits.IsBird;

public abstract class Bird extends Animal implements IsBird, CanFly, HasWings, HasFeathers {
}
