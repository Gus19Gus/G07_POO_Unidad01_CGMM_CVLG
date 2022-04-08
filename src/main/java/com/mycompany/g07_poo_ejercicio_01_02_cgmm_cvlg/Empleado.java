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
    int anioIngreso;
    public double calcularAPagar(){
        var retorno=1000d;
        if(this.horasTrabajadas>=0&&this.horasTrabajadas<=300){
            retorno=this.horasTrabajadas*this.costoHora;
        }
        return retorno;
    }
    /**public int calcularYear(int currentYear){
        var retorno=10000;
        if(this.anioingreso>=0&&this.anioingreso<=currentYear){
             retorno=currentYear-anioingreso;
         }else{
             retorno=0;
         }
         return retorno;
}       
    public double calcularIngresos(int calcularYear){
        var retorno=2022;
        if(this.calcularYear(calcularYear)>=0 && this.calcularYear(calcularYear)<=2022){
            retorno=(int) (this.calcularYear(calcularYear)*0.2);
        return retorno;
    }
        return retorno; 
}
**/
    public double calcularIngreso(int anioActual){
        
        var sueldo = 1000d;
        var edadEmpleado = 1000d;
        var multiplicacion1 = 1000d;
        var multiplicacion2 = 1000d;
        var suma = 1000d;
            sueldo = horasTrabajadas * costoHora;
            edadEmpleado = anioActual - anioIngreso;
            multiplicacion1 = sueldo * 0.02; 
            multiplicacion2 = edadEmpleado * multiplicacion1;
            suma = sueldo + multiplicacion2;    
        return suma;
    } 
    public double calcularHoraBonusExtra(int maximoHorasTrabajadas){  
        var retorno = 1000d;
        var multiplicacion3 = 1000d; 
        if(this.horasTrabajadas >= 0 && this.horasTrabajadas <= 150);
            retorno =(this.horasTrabajadas - maximoHorasTrabajadas);
            multiplicacion3 = (this.costoHora * retorno);
        return multiplicacion3;
    } 
    public double calcularImpuestos(int limit1, int limit2, int limit3 ){    
        var retorno=100d;
        if(this.costoHora*horasTrabajadas >= 0 && this.costoHora*horasTrabajadas <= limit1){
            if(this.costoHora*horasTrabajadas >= limit1 && this.costoHora*horasTrabajadas<= limit2)
                retorno=this.costoHora*horasTrabajadas*0.05;
            else
                retorno=this.costoHora*horasTrabajadas*0.12;
        }else{
             if(this.costoHora*horasTrabajadas>=limit2 && this.costoHora*horasTrabajadas<=limit3)
                retorno=this.costoHora*horasTrabajadas*0.25;
        }
        return retorno;
   }
}
