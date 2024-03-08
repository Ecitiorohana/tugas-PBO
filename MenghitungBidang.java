/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menghitungbidang;

/**
 *
 * @author ASUS
 */
public class MenghitungBidang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jajargenjang jajargenjang = new Jajargenjang();
        
        jajargenjang.setAlas(5);
        jajargenjang.setTinggi(4);
        
        System.out.println("menghitung luas jajargenjang");
        System.out.println("=======");
        System.out.println("alas:"+jajargenjang.getAlas());
        System.out.println("tinggi:"+jajargenjang.getTinggi());
        System.out.println("luasnya adalah:"+jajargenjang.getLuas());
    }
    
}
