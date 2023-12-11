package ownable.locations.reallclasses;

import enums.Sex;
import enums.Sounds;
import enums.Thoughts;
import ownable.locations.abstractclasses.Loc;
import ownable.persons.abstractclasses.AlivePerson;
import ownable.persons.realclasses.Jude;
import ownable.persons.abstractclasses.Person;

import static utilites.Delay.delay;

public class Grave extends Loc {

    @Override
    public boolean getUsl(Person p){
        if( Gates.getOpened()){
            return super.getUsl(p);
        }else{
            Gates.open();
            return  super.getUsl(p);
        }
    }
    @Override
    public void enter(AlivePerson p) {
        super.enter(p);
        if (p.getName().equals("Луис")) {
            p.think(Thoughts.LUIS3);
            p.remember(new Jude("Джуд", Sex.MALE), Thoughts.LUIS2);
        }
    }

    public Grave() {
        super("кладбище");
    }
    public static class Gates extends Loc {
        public static boolean opened = false;
        public static void open(){
            delay();
            opened = true;
            System.out.println(Sounds.SKRIP.getSound()+"Ворота открываются");
        }
        public static void close(){
            delay();
            opened = false;
            System.out.println(Sounds.SHELK.getSound()+"Ворота закрываются");
        }
        static public boolean getOpened(){
            return opened;
        }


        public Gates(String n) {
            super(n);
        }
    }
}

