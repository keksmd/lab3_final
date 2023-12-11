package main;


import enums.*;
import items.*;
import ownable.locations.reallclasses.Allley;
import ownable.locations.reallclasses.Grave;
import ownable.locations.reallclasses.GraveTrail;
import ownable.locations.reallclasses.Tombs;
import ownable.persons.collectiveclasses.Corpse;
import ownable.persons.realclasses.DeadGaje;
import ownable.persons.realclasses.Jude;
import ownable.persons.realclasses.Luis;

public class Main {
    public static void main(String[] args) {

        StoryTell.setTime(Time.EVENING);
        StoryTell.setStory();
        StoryTell.story();
    }
    public static class StoryTell {
        private static Time time;

        public static void setTime(Time time) {
            StoryTell.time = time;
        }
        public static Time getTime() {
            return time;
        }

        static void story(){
            Luis luis = new Luis("Луис", Sex.MALE);
            Grave grave = new Grave();
            Tombs gajes_tomb = new Tombs("могила Гэджа");
            Allley alley = new Allley();
            Tombs tomb = new Tombs("могила");
            Jude jude = new Jude("Джуд",Sex.MALE);
            DeadGaje gajed = new DeadGaje("Гэдж",Sex.MALE,gajes_tomb);
            GraveTrail trail = new GraveTrail();
            Food apple = new Food(50,ItemSeize.SMALL,"apple");
            grave.enter(luis);
            luis.run();
            luis.go_to(trail);
            luis.go_to(alley);
            luis.go_to(gajes_tomb);
            luis.resurrect(gajed);

        }
        static void setStory(){
            System.out.println("за окном " + time.getValue());
        }
    }

}