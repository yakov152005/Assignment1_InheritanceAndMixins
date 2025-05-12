package QueastionOne.entities;

import QueastionOne.traits.CanGrow;
import QueastionOne.traits.IsAlive;
import QueastionOne.traits.IsLivingThing;

public abstract class LivingThing extends Entity implements IsLivingThing, CanGrow, IsAlive {
}
