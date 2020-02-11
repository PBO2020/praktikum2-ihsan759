package kopi;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class mesin {

    Scanner s = new Scanner(System.in);
    ArrayList<Kopi> kopi = new ArrayList<Kopi>();

    void menu() {
        Kopi k = new Kopi();
        Kopi k1 = new Kopi();
        Kopi k2 = new Kopi();
        k.setkopi("arabica");
        k.setasal("timur tengah");
        k1.setkopi("robusta");
        k1.setasal("eropa");
        k2.setkopi("Flores");
        k2.setasal("asia");
        kopi.add(k);
        kopi.add(k1);
        kopi.add(k2);
        menu1();
    }

    void menu1() {
        System.out.println("\nSelamat datang di mesin kopi ^^");
        System.out.println("[1] Tampil daftar kopi");
        System.out.println("[2] Pesan kopi");
        System.out.println("[3] Keluar");
        System.out.print("Silahkan pilih : ");
        String pilih = s.next();
        switch (pilih) {
            case "1":
                for (int i = 0; i < kopi.size(); i++) {
                    int j = 1 + i;
                    System.out.println("Menu kopi adalah " + j + " " + kopi.get(i).getkopi());
                }
                menu1();
                break;
            case "2":
                System.out.print("Pilih topping : ");
                String topping = s.next();
                System.out.print("\nMasukan kopi yang mau di pilih :");

                try {
                    
                    Integer p = s.nextInt() - 1;
                    
                    System.out.println("\nPesanan anda adalah kopi " + kopi.get(p).getkopi() + " yang berasal dari " + kopi.get(p).getasal() + " dengan " +topping);
                } catch (Exception e) {
                    System.out.println("\nMaaf pilihan yang anda pilih salah");
                }
                System.out.println("\nTerima kasih telah memesan");
                menu1();
                break;
            case "3":
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan anda salah silahkan pilih kembali");
                menu();
        }
    }

    public static void main(String args[]) {
        mesin m = new mesin();
        m.menu();
    }
}
