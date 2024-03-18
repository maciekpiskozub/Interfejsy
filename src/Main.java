import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        PilnyUczen zygmunt = new PilnyUczen();
        PilnyUczen filip = new PilnyUczen();

        KiepskiUczen tymon = new KiepskiUczen();
        KiepskiUczen adrian = new KiepskiUczen();


        ArrayList<Uczen> uczniowie = new ArrayList<>();
        uczniowie.add(zygmunt);
        uczniowie.add(filip);
        uczniowie.add(tymon);
        uczniowie.add(adrian);



        for(Uczen u: uczniowie) {
            System.out.println(u.getClass().getName());
            u.uczSie();
            u.spij();
            System.out.println("------------------");
        }

        zygmunt.bierzUdzialWSzybkiej20();

        ArrayList<PilnyUczen> pilniUczniowie = new ArrayList<>();
        pilniUczniowie.add(zygmunt);
        pilniUczniowie.add(filip);
        zygmunt.uczSie();
        zygmunt.uczSie();
        Collections.sort(pilniUczniowie);
        System.out.println(pilniUczniowie);







    }
}