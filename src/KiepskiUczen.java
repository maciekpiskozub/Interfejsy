public class KiepskiUczen implements Uczen, Comparable<KiepskiUczen> {
    private int punktySnu = 0;

    @Override
    public void uczSie() {
        System.out.println("Nauka jest dla slabych");
    }

    @Override
    public void spij() {
        System.out.println("Spie caly czas :((((");
        punktySnu++;
    }


    public void graj() {
        System.out.println("Im playin we outside");
    }


    @Override
    public int compareTo(KiepskiUczen o) {
        return punktySnu - o.punktySnu;
    }
}
