/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vttanh.pojo;

/**
 *
 * @author Trâm Anh
 */
public class TacGia {
    private int id;
    private String Ten;

    public TacGia(int id, String Ten) {
        this.id = id;
        this.Ten = Ten;
    }

    public TacGia() {
    }

    @Override
    public String toString() {
        return this.getTen();
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the Ten
     */
    public String getTen() {
        return Ten;
    }

    /**
     * @param Ten the Ten to set
     */
    public void setTen(String Ten) {
        this.Ten = Ten;
    }

 
}
