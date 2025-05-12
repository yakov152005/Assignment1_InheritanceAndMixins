package QueastionOne.entities;


import QueastionOne.traits.HasLeaves;
import QueastionOne.traits.HasPetals;
import QueastionOne.traits.IsBeautiful;
import QueastionOne.traits.IsFlower;

public abstract class Flower extends Plant implements IsFlower, IsBeautiful, HasLeaves, HasPetals {
}
