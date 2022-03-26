package Praktikum2;
import java.math.*;
import java.util.Scanner;

public class Bola {
    static Scanner sc = new Scanner(System.in);

    public double jarijari;

    public void setJarijari(){
        System.out.println("Tentukan jari jari: ");
        jarijari = sc.nextDouble();
    }

    public void ShowDiameter(){
        double diameter = jarijari * 2;
        System.out.println("Diameter bola: "+diameter);
    }

    public void ShowLuasPermukaan(){
        double lp = (4 * (3.14) * (jarijari * jarijari));
        System.out.println("Rumus Luas Permukaan: (4 * (3.14) * (jarijari * jarijari))");
        System.out.println("Luas permukaan: "+lp);
    }

    public void ShowVolume(){
        double volume = ((4 / 3) * (3.14) * (jarijari * jarijari * jarijari));
        System.out.println("Rumus Volume: ((4 / 3) * (3.14) * (jarijari * jarijari * jarijari))");
        System.out.println("Volume: "+volume);
    }
}
