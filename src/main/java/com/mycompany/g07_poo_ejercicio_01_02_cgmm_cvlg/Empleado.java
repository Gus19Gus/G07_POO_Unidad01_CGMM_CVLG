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
            retorno=this.horasTrabajadas*this.costoHora+this.calcularHoraBonusExtra(horasTrabajadas)-this.calcularImpuestos(anioIngreso, anioIngreso, anioIngreso);
        }
        return retorno;
    }
    public double calcularIngreso(int anioActual){
        
        var sueldo = 1000d;
        var edadEmpleado = 1000;
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
        if(this.horasTrabajadas >= 0 && this.horasTrabajadas <= 150);
            retorno =(this.horasTrabajadas - maximoHorasTrabajadas);
           retorno=(this.costoHora *2* retorno);
        return 0;
    } 
    public double calcularImpuestos(int limit1, int limit2, int limit3 ){
            
        var retorno=10000d;
        double r;
        r= this.costoHora*this.horasTrabajadas;
        if(r>0 && r<limit1){
            retorno=0;
        }else{
            if(r>= limit1 && r<limit2){
                retorno=this.costoHora*this.horasTrabajadas*0.05;
            }else{
                if(r>=limit2 && r<=limit3){
                    retorno=this.costoHora*this.horasTrabajadas*0.12;
                }else{
                    if(r>limit3){
                        retorno=this.costoHora*this.horasTrabajadas*0.25;
                    }
                }
                
            }
        }
        return retorno;
}
}
