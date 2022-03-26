package Praktikum;

public class UjiBus {
    public static void main(String[] args) {
        // TODO code application logic here
        Bus busMini = new Bus(5);
        busMini.getPassword(40);
        busMini.getPassword(90);
        busMini.cetak();

        busMini.penumpangBaru();
        busMini.Counter(50);
        busMini.pluspenumpang(3);
        busMini.cetak();

        busMini.pluspenumpang(1);
        busMini.Counter(60);
        busMini.cetak();

        busMini.pluspenumpang(1);
        busMini.Counter(70);
        busMini.cetak();
        busMini.getAverage();


    }
}
