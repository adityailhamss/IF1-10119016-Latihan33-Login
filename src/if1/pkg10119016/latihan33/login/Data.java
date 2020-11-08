/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119016.latihan33.login;

/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan data user
 * 
 */
public class Data {
private static String username = "adityaIlham";
    private static String password = "selalubaik";
    private boolean statusAkun;
    
    private boolean cekAkun(String parUserName, String parPassword) {
        return (parUserName.equals(username))? 
                (parPassword.equals(password)) : false;
    }
    
    private void hasilLogin(boolean status, String parUserName) {
        if(status) {
            System.out.println("******HALLO ".concat(parUserName.toUpperCase()).concat("******"));
            System.out.println("Selamat Datang di Aplikasi ini");
        } else {
            System.out.println("Ooops, Username atau Password anda salah");
        }
    }
    
    public void pengecekkanLogin(String parUserName, String parPassword) {
        hasilLogin(cekAkun(parUserName, parPassword), parUserName);
    }
}
