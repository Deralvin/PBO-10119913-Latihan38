/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119913latihan38;

/**
 * @author
 * NAMA     : Muhammad Alvin Rizqi Ramdhan 
 * KELAS    : IF 10K
 * NIM      : 10119913
 */public class PBO10119913Latihan38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     	    double diameter, jarijari, luas, keliling;
        System.out.println ("=====Perhitungan Lingkaran=====");
        RumusLingkaran hitung_lingkaran = new RumusLingkaran();

        diameter = hitung_lingkaran.getDiameter();
        jarijari = hitung_lingkaran.getJarijari();
        luas = hitung_lingkaran.getLuas();
        keliling = hitung_lingkaran.getKeliling();
        hitung_lingkaran.hasilHitung();
    }
  
    
}
