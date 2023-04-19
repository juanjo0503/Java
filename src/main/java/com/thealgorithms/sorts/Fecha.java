/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package probar_git2;

import java.time.LocalDate;

/**
 *
 * @author alumnoT
 */
public class Fecha {

    //atributos
    private int dia;
    private int mes;
    private int year;

    public Fecha(int dia, int mes, int year) {
        this.dia = dia;
        this.mes = mes;
        this.year = year;
    }
    public Fecha(){
        LocalDate hoy= LocalDate.now();
        dia=hoy.getDayOfMonth();
        mes=hoy.getMonthValue();
        year=hoy.getYear();
    }

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", year=" + year + '}';
    }

}
