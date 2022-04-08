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
        empleado1.anioIngreso= 2010;
        empleado1.horasTrabajadas=160;
        empleado1.costoHora=11.50;
        System.out.println(empleado1.nombre+" | "+
                           empleado1.anioIngreso+" | "+
                           empleado1.horasTrabajadas+" | "+
                           empleado1.costoHora+" | ");
        System.out.println("El valor total a pagar es: "+empleado1.calcularAPagar());

        System.out.println("Los ingresos totales son: "+empleado1.calcularIngreso(2022));
  
        System.out.println("Los impuestos son: "+empleado1.calcularImpuestos(500, 1000, 2000));
        System.out.println("Los bonos son: "+empleado1.calcularHoraBonusExtra(150));
        System.out.println("----------------------------------------------------------      ");
        var empleado2=new Empleado();
        empleado2.nombre="Mariana";
        empleado2.anioIngreso= 2020;
        empleado2.horasTrabajadas=200;
        empleado2.costoHora=5;
        System.out.println(empleado2.nombre+" | "+
                           empleado2.anioIngreso+" | "+
                           empleado2.horasTrabajadas+" | "+
                           empleado2.costoHora+" | ");
        System.out.println("El valor total a pagar es: "+empleado2.calcularAPagar());
        System.out.println("Los años trabajados totales son: "+empleado2.calcularIngreso(2022));
        System.out.println("Los impuestos son: "+empleado2.calcularImpuestos(500, 1000, 2000));
        System.out.println("----------------------------------------------------------      ");
        var empleado3=new Empleado();
        empleado3.nombre="Carlos";
        empleado3.anioIngreso= 2018;
        empleado3.horasTrabajadas=150;
        empleado3.costoHora=8;
        System.out.println(empleado3.nombre+" | "+
                           empleado3.anioIngreso+" | "+
                           empleado3.horasTrabajadas+" | "+
                           empleado3.costoHora+" | ");
        System.out.println("El valor total a pagar es: "+empleado3.calcularAPagar());
        System.out.println("Los ingresos totales son: "+empleado3.calcularIngreso(2022));
        System.out.println("Los impuestos son: "+empleado3.calcularImpuestos(500, 1000, 2000));
        System.out.println("El bono total es: "+empleado3.calcularHoraBonusExtra(150));
    }
}


    
