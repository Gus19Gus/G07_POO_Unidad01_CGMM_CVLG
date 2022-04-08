/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.g07_poo_ejercicio_01_02_cgmm_cvlg;

/**
 *
 * @author HP USER
 */
public class Pirncipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var empleado1=new Empleado();
        empleado1.nombre="Luis";
        empleado1.anioingreso= 2010;
        empleado1.horasTrabajadas=160;
        empleado1.costoHora=11.50;
        System.out.println(empleado1.nombre+" | "+
                           empleado1.anioingreso+" | "+
                           empleado1.horasTrabajadas+" | "+
                           empleado1.costoHora+" | ");
        System.out.println("El valor total a pagar es: "+empleado1.calcularAPagar());
        System.out.println("El valor de los ingresos totales son: "+empleado1.calcularIngresos(0));
        System.out.println("Los años trabajados totales son: "+empleado1.calcularYear(2022));
    }
}


    
