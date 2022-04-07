/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g07_poo_ejercicio_01_02_cgmm_cvlg;

/**
 *
 * @author HP USER
 */
public class Empleado {
    String nombre;
    int horasTrabajadas;
    double costoHora;
    int anioingreso;
    public double calcularAPagar(){
        var retorno=1000d;
        if(this.horasTrabajadas>=0&&this.horasTrabajadas<=300){
            retorno=this.horasTrabajadas*this.costoHora;
        }
        return retorno;
    } 
public int calcularYear(int currentYear){
        var retorno =10000d;
        if(this.anioingreso <= 2022){
            retorno=this.calcularYear(1)*0.2;
        }
        return (int) retorno;
}
public double calcularIngresos(int calcularYear){
        var retorno=2022;
        if(this.calcularYear(calcularYear)>=0 && this.calcularYear(calcularYear)<=2022){
            retorno=(int) (this.calcularYear(calcularYear)*0.2);
        return retorno;
    }
        return retorno;
}
}
