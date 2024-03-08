/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menghitungbidang;

/**
 *
 * @author ASUS
 */
public class Jajargenjang {
private int alas;
private int tinggi;

public int getAlas(){
    return alas;
}

public void setAlas(int alas){
    this.alas=alas;
}

public int getTinggi(){
    return tinggi;
}

public void setTinggi(int tinggi){
    this.tinggi=tinggi;
}

public Jajargenjang(){
    int a =0;
    int t =0;
}

public int luas(int a,int t){
    return a*t;
}

public int getLuas(){
    return luas(alas,tinggi);
}
}
