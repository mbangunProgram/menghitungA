/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menghitung;

import bangundatar.Rumus;

/**
 *
 * @author Fadwa Pamulasih
 */
public class Penghitungan implements Rumus{
    public int sisi;
    public int sisiSegitiga;
    public int panjang;
    public int lebar;
    public int tinggi;
    public int alas;
    
    @Override
    public int kelilingPersegiPanjang() {
        return 2 * (lebar + panjang);
    }

    @Override
    public int luasPersegiPanjang() {
        return panjang * lebar;
    }

    @Override
    public int kelilingPersegi() {
        return 4 * this.sisi;
    }

    @Override
    public int luasPersegi() {
        return sisi * sisi;
    }

    @Override
    public int kelilingSegitiga() {
        return (2 * sisiSegitiga) + alas;
    }

    @Override
    public double luasSegitiga() {
        return 0.5 * alas * tinggi * sudut;
    }
    
}
