/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menghitung;
/**
 *
 * @author Fadwa Pamulasih
 */
public class Persegi extends Penghitungan{
    public void tampilHasil(){
        System.out.println("Persegi");
        System.out.println("------------");
        System.out.println("Luasnya: " + this.luasPersegi());
        System.out.println("Kelilingnya: " + this.kelilingPersegi());
    }
}
