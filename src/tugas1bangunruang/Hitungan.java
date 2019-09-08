/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1bangunruang;

/**
 *
 * @author acer
 */
class Hitungan {
    double VKubus(double rusuk) { //Rumus Volume Kubus
        return rusuk * rusuk * rusuk;
    }
    double VBalok(double p, double l, double t){ //Rumus Volume Balok
        return p * l * t;
    }
    double VBola(double r) { //Rumus Volume Bola
        return 4/3 * 3.14 * r * r * r;
    }
    double LPKubus(double rusuk) { //Rumus Luas Permukaan Kubus
        return 6 * rusuk * rusuk ;
    }
    double LPBalok(double p, double l, double t){ //Rumus Luas Permukaan Balok
        return (2 * p * l) + (2 * t * l) + (2 * t * p);
    }
    double LPBola(double r) { //Rumus Luas Permukaan Bola
        return 4 * 3.14 * r * r;
    }
}
