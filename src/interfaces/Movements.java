package interfaces;

import ownable.locations.abstractclasses.Loc;

public interface Movements {
    public void run();
    public void go();
    public void go_to(Loc l);


}
