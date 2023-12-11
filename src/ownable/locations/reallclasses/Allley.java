package ownable.locations.reallclasses;

import enums.*;
import ownable.locations.abstractclasses.LocThrough;
import ownable.persons.abstractclasses.AlivePerson;
import ownable.persons.abstractclasses.Person;

import static utilites.Randomizer.chance;

public class Allley extends LocThrough {

    public Allley() {
        super("аллея");
    }
    @Override
    public void enter(AlivePerson p) {
        super.enter(p);
        if (chance(0.5)){
            System.out.println(Sounds.SHURSH.getSound() + " Шуршат деревья");
        }
        if (p.getName().equals("Луис")) {
            p.think(Thoughts.LUIS1);
            p.setHeartbeats(Math.toIntExact(Math.round(p.getHeartbeats() * 1.2)));
            p.setSpeed(Speed.FAST);
        }
    }
    @Override
    public boolean getUsl(Person p) {
        if(p.getLoc().getName().equals("тропинка")){
            return super.getUsl(p);
        }else{
            return false;
        }

    }
}

