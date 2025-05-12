package QueastionOne.entities;

import QueastionOne.traits.HasBark;
import QueastionOne.traits.HasBranch;
import QueastionOne.traits.IsBig;
import QueastionOne.traits.IsTree;

public abstract class Tree extends Plant implements IsTree, HasBark, HasBranch, IsBig {
}
