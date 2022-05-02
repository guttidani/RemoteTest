/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author hallgato
 */
public class Ember {
    private String nev;
    private int kor;

    @Override
    public String toString() {
        return "Ember{" + "nev= " + nev + ", kor= " + kor + '}';
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }
    
}
