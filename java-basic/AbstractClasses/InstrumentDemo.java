/* 3. Abstract Instrument class with array of 10 instruments and instanceof check. */
abstract class Instrument {
    abstract void play();
}
class Piano extends Instrument { void play() { System.out.println("Piano is playing tan tan tan"); } }
class Flute extends Instrument { void play() { System.out.println("Flute is playing toot toot toot"); } }
class Guitar extends Instrument { void play() { System.out.println("Guitar is playing tin tin tin"); } }

public class InstrumentDemo {
    public static void main(String[] args) {
        Instrument[] inst = new Instrument[10];
        for(int i=0; i<10; i++) {
            if(i%3==0) inst[i] = new Piano();
            else if(i%3==1) inst[i] = new Flute();
            else inst[i] = new Guitar();
            inst[i].play();
        }
        for(int i=0; i<10; i++) {
            if(inst[i] instanceof Piano) System.out.println("Index " + i + " is Piano");
        }
    }
}