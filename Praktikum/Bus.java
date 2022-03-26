package Praktikum;

import java.util.Scanner;

public class Bus {
    static Scanner sc = new Scanner(System.in);
    private double penumpang,maxpenumpang;

    // konstruktor
    public Bus(int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang = 0;
    }

    //method mutator
    public void pluspenumpang(double penumpang){
        double temp;
        penumpangBaru();
        Counter(50);
        temp=this.penumpang+penumpang;
        if (temp>=maxpenumpang){
            System.out.println("Overload penumpang");
        }
        else {
            this.penumpang=temp;
        }

    }
    public void getPassword(int password){
        if (password==90){
            System.out.println("password benar");
        }
        else{
            System.out.println("pass salah");
        }

    }
    public void cetak(){
        System.out.println("Penumpang sekarang = "+penumpang);
        System.out.println("penumpang seharusnya adalah ="+maxpenumpang);
    }

    public void Counter(double counter){
        System.out.println("Berat penumpang: "+counter);
    }

    public void penumpangBaru(){
        System.out.println("Penambahan penumpang = ");
        double penumbangbaru = sc.nextDouble();
        System.out.println("Jumlah penumpang sekarang = "+(penumpang + penumbangbaru));
    }

    public void getAverage(){
        System.out.println("Rata rata berat penumpang adalah 60KG");
    }

}

