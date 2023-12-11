package ownable.persons.abstractclasses;

import ownable.locations.abstractclasses.Loc;
import enums.Sex;

abstract public class DeadPerson extends Person {

    public DeadPerson(String n, Sex s) {
        super(n, s,0,0);
    }
    public DeadPerson(String n, Sex s,Loc l) {
        super(n, s,0,0,l);
    }




}
