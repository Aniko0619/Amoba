public class Table {
    private final int meret = 10; // 10x10-es tábla
    private char[][] tabla;

    public Table() {
        tabla = new char[meret][meret];
        inicializalTabla();
    }

    private void inicializalTabla() {

        // Tömb feltöltése (jelen esetben "."):

        for (int sor = 0; sor < meret; sor++) {
            for (int oszlop = 0; oszlop < meret; oszlop++) {
                tabla[sor][oszlop] = '.';
            }
        }
    }

    public void kiirTabla() {

        // Fejléc (A–J):

        System.out.print("   ");
        for (int i = 0; i < meret; i++) {
            char betu = (char) ('A' + i);
            System.out.print(betu + " ");
        }
        System.out.println();

        // Sorok és mezők megjelenítése:

        for (int sor = 0; sor < meret; sor++) {
            System.out.print(sor + "  ");
            for (int oszlop = 0; oszlop < meret; oszlop++) {
                System.out.print(tabla[sor][oszlop] + " ");
            }
            System.out.println();
        }
    }


    public int getMeret() {
        return meret;
    }

    public char[][] getTabla() {
        return tabla;
    }
}
