/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan59.detektifconan;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 */
public class Tokoh {
    final String nama;
    final String JK;
    final String pekerjaan;

    public Tokoh(String nama, String JK, String pekerjaan) {
        this.nama = nama;
        this.JK = JK;
        this.pekerjaan = pekerjaan;
    }

    public String getNama() {
        return nama;
    }

    public String getJK() {
        return JK;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }
}
