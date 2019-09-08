/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1bangunruang;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Tugas1bangunruang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tugas1bangunruang = new Scanner(System.in); 
        Hitungan hitung = new Hitungan(); //Memanggil Class
        do {
            System.out.print("------------------ M E N U ------------------ \n1. Volume \n2. Luas Permukaan \n3. Exit \nPilih Menu : "); //Pilihan Menu
            int pilih = tugas1bangunruang.nextInt(); //input pilih
            System.out.println();
            switch (pilih) {
                case 1: { //Jika memilih menu 1
                    System.out.print("1. KUBUS \n2. BALOK \n3. BOLA \nPilih Bangun Ruang  : ");
                    int pilih1 = tugas1bangunruang.nextInt(); //input pilih1
                    System.out.println();
                    switch (pilih1) {
                        case 1: //Pilihan 1 dalam Menu 1
                            System.out.println("-------Volume Kubus--------");
                            System.out.print("Masukkan Panjang Rusuk Kubus    : ");
                            double rusuk = tugas1bangunruang.nextDouble(); //input rusuk 
                            System.out.println(hitung.VKubus(rusuk)); //Pemanggilan VKubus dalam class Hitungan untuk proses Aritmatika
                            break;
                        case 2: //Pilihan 2 dalam Menu 1
                            System.out.println("-------Volume Balok--------");
                            System.out.print("Masukkan Panjang    : ");
                            double p = tugas1bangunruang.nextDouble(); //input p
                            System.out.print("Masukkan Lebar      : ");
                            double l = tugas1bangunruang.nextDouble(); //input l
                            System.out.print("Masukkan Tinggi     : ");
                            double t = tugas1bangunruang.nextDouble(); //input t 
                            System.out.println(hitung.VBalok(p, l, t)); //Pemanggilan VBalok dalam class Hitungan untuk proses Aritmatika
                            break;
                        case 3: //Pilihan 3 dalam Menu 1
                            System.out.println("-------Volume Bola--------");
                            System.out.print("Masukkan Jari-Jari  : ");
                            double r = tugas1bangunruang.nextDouble(); //input r
                            System.out.println(hitung.VBola(r)); //Pemanggilan VBola dalam class Hitungan untuk proses Aritmatika
                            break;
                        default:
                            break;
                    }
                    break;
                }
                case 2: { //Jika Memilih Menu 2
                    System.out.print("1. KUBUS \n2. BALOK \n3. BOLA \nPilih Bangun Ruang  : ");
                    int pilih1 = tugas1bangunruang.nextInt();
                    System.out.println(); //input pilih1
                    switch (pilih1) {
                        case 1: //Pilihan 1 dalam Menu 2
                            System.out.println("-------Luas Permukaan Kubus--------");
                            System.out.print("Masukkan Panjang Rusuk Kubus    : ");
                            double rusuk = tugas1bangunruang.nextDouble(); //input rusuk
                            System.out.println(hitung.LPKubus(rusuk)); //Pemanggilan LPKubus dalam class Hitungan untuk proses Aritmatika
                            System.out.println();
                            break;
                        case 2: //Pilihan 2 dalam Menu 2
                            System.out.println("-------Luas Permukaan Balok--------");
                            System.out.print("Masukkan Panjang    : ");
                            double p = tugas1bangunruang.nextDouble();  //input p
                            System.out.print("Masukkan Lebar      : ");
                            double l = tugas1bangunruang.nextDouble();  //input l
                            System.out.print("Masukkan Tinggi     : ");
                            double t = tugas1bangunruang.nextDouble();  //input t
                            System.out.println(hitung.LPBalok(p, l, t)); //Pemanggilan LPBalok dalam class Hitungan untuk proses Aritmatika
                            System.out.println();
                            break;
                        case 3: //Pilihan 3 dalam Menu 2
                            System.out.println("-------Luas Permukaan Bola--------");
                            System.out.print("Masukkan Jari-Jari  : ");
                            double r = tugas1bangunruang.nextDouble(); //input r
                            System.out.println(hitung.LPBola(r)); //Pemanggilan LPBola dalam class Hitungan untuk proses Aritmatika
                            System.out.println();
                            break;
                        default:
                            break;
                    }
                }
                default:
                case 3: { //Menu 3 Keluar
                    exit(0);
                }
            }
        } while (true);
    }
}
