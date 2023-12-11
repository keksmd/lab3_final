package ownable.locations.abstractclasses;

import items.Food;
import ownable.locations.reallclasses.Grave;
import ownable.persons.abstractclasses.AlivePerson;
import ownable.persons.abstractclasses.Person;
import utilites.Delay;
import ownable.Ownable;

abstract public class Loc extends Ownable {
    private final boolean usl = true;
    public boolean getUsl(Person p){
        return usl;
    }
    public Loc(String n) {
        super(n);
    }




     public void enter(AlivePerson p){
         if(this.getUsl(p)){
             Delay.delayP(p);
            System.out.println(p.getName()+" входит в локацию " + this.getName());
            p.setLoc(this);
            if(this.getClass()== Grave.class){
                Grave.Gates.close();
            }
         }else{
             System.out.println("Невозможно войти в локацию");
         }


     }
 }
