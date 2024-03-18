public class PilnyUczen implements Uczen, Comparable<PilnyUczen> {


    private int punktyNauki = 0;
    @Override
    public void uczSie() {
        System.out.println("Ucze sie pilnie");
        punktyNauki++;

    }

    @Override
    public void spij() {
        System.out.println("Sen jest dla slabych");
    }

    public void bierzUdzialWSzybkiej20() {
        System.out.println("Musze miec wynik 20/20");
    }


    @Override
    public int compareTo(PilnyUczen o) {
        return punktyNauki - o.punktyNauki;
    }
}
