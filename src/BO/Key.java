/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Key implements Serializable{
    private String key;

    public Key(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
    
}
