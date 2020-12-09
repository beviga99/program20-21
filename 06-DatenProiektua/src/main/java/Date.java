/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Date {
    private int year, month, day;
    
    public Date(int year, int month, int day){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void setDay(int day){
        this.day = day;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setDate(int year, int month, int day){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public String toString(){
        return String.format("%4d/%02d/%02d", year, month, day);
    }
    public String getHilabeteaLetretan(){
        String[] mes = {"Urtarrila", "Otsaila", "Martxoa", "Apirila", "Maiatza", "Ekaina", "Uztaila", "Abuztua", "Iraila", "Urria", "Azaroa", "Abendua"};
        return mes[month-1];
    }
    public String getHilabeteaLetretan(String hiz){
        String[][] mes = {{"Urtarrila", "Otsaila", "Martxoa", "Apirila", "Maiatza", "Ekaina", "Uztaila", "Abuztua", "Iraila", "Urria", "Azaroa", "Abendua"}, {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}, {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}};
        int num = 0;
        switch (hiz){
 
            case "EU":
                num = 0;
            case "ES":
                num = 1;
            case "EN":
                num = 2;
        }
       return mes[num][month-1];
    }
}
