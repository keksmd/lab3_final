package ownable.persons.realclasses;

import ownable.locations.abstractclasses.Loc;
import enums.Sex;
import ownable.persons.abstractclasses.DeadPerson;

public class DeadGaje extends DeadPerson {

    public DeadGaje(String n, Sex s) {
        super(n, s);
    }
    public DeadGaje(String n, Sex s, Loc l) {
        super(n, s,l);
    }




}
