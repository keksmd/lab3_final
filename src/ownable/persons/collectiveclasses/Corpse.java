package ownable.persons.collectiveclasses;

import enums.Sex;
import ownable.locations.abstractclasses.Loc;
import ownable.persons.abstractclasses.DeadPerson;

public class Corpse extends DeadPerson {

    public Corpse(String n, Sex s) {
        super(n, s);
    }

    public Corpse(String n, Sex s, Loc l) {
        super(n, s, l);
    }
}
