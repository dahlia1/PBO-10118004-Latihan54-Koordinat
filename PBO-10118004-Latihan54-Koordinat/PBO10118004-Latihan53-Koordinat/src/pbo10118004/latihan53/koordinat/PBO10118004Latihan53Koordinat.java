/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118004.latihan53.koordinat;

/**
 *
 * @author ASUS A411UF
 */
public class PBO10118004Latihan53Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         WarnaKoordinat wKoordinat = new WarnaKoordinat (10,4,"Jingga");
        System.out.println("Warna Koordinat : "+wKoordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+wKoordinat.getX()+", y : "+wKoordinat.getY());
    }
    
}


    
