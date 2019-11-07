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
public class TokohPendukung extends Tokoh{
    private final String sebutan;
    private final String hubungan;

    public TokohPendukung(String nama, String JK, String pekerjaan, String sebutan, String hubungan) {
        super(nama, JK, pekerjaan);
        this.sebutan = sebutan;
        this.hubungan = hubungan;
    }

    public String getSebutan() {
        return sebutan;
    }

    public String getHubungan() {
        return hubungan;
    }

    public void tampilTokoh() {
        System.out.printf("Nama \t\t: %s%n", nama);
        System.out.printf("Jenis Kelamin \t: %s%n", JK);
        System.out.printf("Pekerjaan \t: %s%n", pekerjaan);
        System.out.printf("Sebutan \t: %s%n", sebutan);
        System.out.printf("Hubungan \t: %s%n%n", hubungan);
    }
}
