/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohuklpbo;

import java.util.ArrayList;

/**
 *
 * @author felix ryan
 */
public class barang {

    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    public barang() {
        this.namaBarang.add("Cokelat merah");
        this.stok.add(100);
        this.harga.add(10000);
        this.namaBarang.add("Sabun bluband");
        this.stok.add(150);
        this.harga.add(5000);
        this.namaBarang.add("Odol komodo");
        this.stok.add(1300);
        this.harga.add(15000);
        this.namaBarang.add("minyak langka ");
        this.stok.add(20);
        this.harga.add(50000);
        this.namaBarang.add("sampo bulu mata");
        this.stok.add(40);
        this.harga.add(15000);
        this.namaBarang.add("baju partai  ");
        this.stok.add(25);
        this.harga.add(35000);
        this.namaBarang.add("rokok surya   ");
        this.stok.add(25);
        this.harga.add(35000);
    }

    public int getJmlBarang() {
        return this.namaBarang.size();
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang.add(namaBarang);
    }

    public String getNamaBarang(int idBarang) {
        return this.namaBarang.get(idBarang);
    }

    public void setStok(int stok) {
        this.stok.add(stok);
    }

    public int getStok(int idBarang) {
        return this.stok.get(idBarang);
    }

    public void editStok(int idBarang, int stok) {
        this.stok.set(idBarang, stok);;
    }

    public void setHarga(int harga) {
        this.harga.add(harga);
    }

    public int getHarga(int idBarang) {
        return this.harga.get(idBarang);
    }
}
