/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohuklpbo;

/**
 *
 * @author felix ryan
 */
public class TokoOnline {

    public static void main(String[] args) {
        member m = new member();
        karyawan k = new karyawan();
        barang b = new barang();
        transaksi t = new transaksi();
        laporan l = new laporan();
        l.laporan(b);
        l.laporan(m);
        l.laporan(t, b);
        t.prosesTransaksi(m, t, b);
        l.laporan(t, b);
        l.laporan(b);
        l.laporan(m);
    }
}
