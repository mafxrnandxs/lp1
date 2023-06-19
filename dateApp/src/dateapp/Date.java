/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dateapp;

/**
 *
 * @author mafxr
 */
public class Date {
    
    private int dia;
    private int mes;
    private int ano;
    
    public Date(int d, int m, int a){

     if (testaData (d,m,a) == false){
       this.dia = 1;
       this.mes = 1;
       this.ano = 1;
    } else {
        this.dia = d;
        this.mes = m;
        this.ano = a;
     }
 }


    public boolean testaData(int d, int m , int a) {
            if ((d > 0)&& (d <= 31)
            && (m > 0)&& (m <= 12)
            && a >=1)
            return true;
            else
            return false;
    }

    public String displayDate(){
            return this.dia+"/"+this.mes+"/"+this.ano;
    }


    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
         this.ano = ano;
    }
}
