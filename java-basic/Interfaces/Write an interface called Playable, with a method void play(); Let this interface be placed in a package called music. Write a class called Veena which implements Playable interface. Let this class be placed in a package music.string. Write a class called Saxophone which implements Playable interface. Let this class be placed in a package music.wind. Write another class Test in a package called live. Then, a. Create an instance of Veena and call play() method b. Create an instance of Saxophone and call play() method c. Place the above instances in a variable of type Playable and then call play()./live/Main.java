package live;

import music.Playable;
import music.String.Veena;
import music.wind.Saxophone;

public class Main{
    public static void main(String[] args) {
        Veena v=new Veena();
        v.play();
        Saxophone s=new Saxophone();
        s.play();
        Playable p;
        p=new Veena();
        p.play();
        p=new Saxophone();
        p.play();
    }
}


//run
//javac music/Playable.java music/string/Veena.java music/wind/Saxophone.java live/Main.java
//javac live.java
