/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119016.latihan33.login;
import java.util.Scanner;
/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan user login
 */
public class Login {
private static String usName, passWord;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        
        System.out.print("Masukkan Username = ");
        input = scanner.nextLine();
        usName = input;
        
        System.out.print("Masukkan Password = ");
        input = scanner.nextLine();
        passWord = input;
        
        System.out.println("");
        Data data = new Data();
        data.pengecekkanLogin(usName, passWord);
    }
    
}
