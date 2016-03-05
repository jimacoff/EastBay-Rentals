/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csueb.cs3520.bean;

import java.sql.Date;


public class Rental {
    private int idCar;
    private String username;
    private Date begin;
    private Date end;
    private Double total;

    public Rental() {
    }

    public Rental(int idCar, String username, Date begin, Date end, Double total) {
        this.idCar = idCar;
        this.username = username;
        this.begin = begin;
        this.end = end;
        this.total = total;
    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

  
    
    
    
}
