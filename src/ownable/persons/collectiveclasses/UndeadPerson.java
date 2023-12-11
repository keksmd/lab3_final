package ownable.persons.collectiveclasses;

import enums.*;
import interfaces.Movements;
import ownable.persons.abstractclasses.AlivePerson;

public class UndeadPerson extends AlivePerson implements Movements {

    public UndeadPerson(String n, Sex s){
        super(n,s,0);
    }




}
