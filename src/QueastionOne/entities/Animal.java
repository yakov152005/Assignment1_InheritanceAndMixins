package QueastionOne.entities;

import QueastionOne.traits.CanMove;
import QueastionOne.traits.HasSkin;
import QueastionOne.traits.IsAnimal;

public abstract class Animal extends LivingThing implements IsAnimal, CanMove, HasSkin {
}
