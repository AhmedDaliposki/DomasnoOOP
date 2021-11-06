class Covek {
    private String ime;

    public void setName(String name) { this.ime = name; }
    public String getName() { return ime; }
    public String toString() { return ime; }
}
class Ocenka {
    private int vrednost;
    private String datum;
    private String predmet;
    public void setOcenka(int vrednost, String datum, String predmet) {
        this.vrednost = vrednost;
        this.datum = datum;
        this.predmet = predmet;
    }

    public int getVrednost() { return vrednost; }
    public String getDatum() { return datum; }
    public String getPredmet() { return predmet; }
    public String toString() {
        return datum + " " + predmet + " " + String.valueOf(vrednost);
    }
}

class Student extends Covek {
    private String indeks;
    private Ocenka ocenki [] = new Ocenka[100];
    private int num = 0;
    public void setIndeks(String indeks) { this.indeks = indeks; }
    public String getIndeks() { return indeks; }
    public void setOcenka(Ocenka o) {
        System.out.println("Vmetnata ocenka: " + o.toString());
        ocenki[num] = o;
        num++;
    }

    public float getProsek(){
        int total = 0;
        for (int i = 0; i < num; i++){
            total = total + ocenki[i].getVrednost();
        }
        return (float) total / num;
    }

    public String toString() {
        return this.getName() + " " + indeks + " " + String.valueOf(getProsek());
    }
}

public class Main
{
    public static void main(String[] args) {
        Student Ahmed = new Student();
        Ahmed.setIndeks("INKI 700");
        Ahmed.setName("Ahmed Daliposki ");

        Ocenka ap = new Ocenka();
        ap.setOcenka(8, "13.02.2019 13:43:30", "Aplikativen Softver");
        Ahmed.setOcenka(ap);

        Ocenka mat1 = new Ocenka();
        mat1.setOcenka(7, "18.02.2019 10:17:28", "Matematika 1");
        Ahmed.setOcenka(mat1);

        Ocenka sp = new Ocenka();
        sp.setOcenka(7, "16.02.2019 13:14:07", "Strukturirano Programiranje");
        Ahmed.setOcenka(sp);

        Ocenka dls = new Ocenka();
        dls.setOcenka(7, "23.06.2019 09:24:39", "Digitalna logika i sistemi");
        Ahmed.setOcenka(dls);
        System.out.println(Ahmed.toString());
    }
}