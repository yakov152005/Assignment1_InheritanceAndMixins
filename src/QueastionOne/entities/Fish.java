package QueastionOne.entities;

import QueastionOne.traits.CanSwim;
import QueastionOne.traits.HasGills;
import QueastionOne.traits.HasScales;
import QueastionOne.traits.IsFish;

public abstract class Fish extends Animal implements IsFish, CanSwim, HasScales, HasGills {
}
