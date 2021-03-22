/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDateTime;

/**
 *
 * @author josemanuelmendez
 */
public class Ficha {
    private int idFicha;
    private int sensor;
    private double temperatura;
    private LocalDateTime fechaHora;

    public Ficha(int idFicha, int sensor, double temperatura, LocalDateTime fechaHora) {
        this.idFicha = idFicha;
        this.sensor = sensor;
        this.temperatura = temperatura;
        this.fechaHora = fechaHora;
    }

    public int getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(int idFicha) {
        this.idFicha = idFicha;
    }

    public int getSensor() {
        return sensor;
    }

    public void setSensor(int sensor) {
        this.sensor = sensor;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }
    
    
    
}
