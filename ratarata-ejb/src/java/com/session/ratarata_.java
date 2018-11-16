/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.session;
import java.text.DecimalFormat;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author HIROMI
 */
@Stateless
@LocalBean
public class ratarata_ {
    String hasil;
    DecimalFormat a = new DecimalFormat ("0.0");

    public String rata2(double nilai1, double nilai2, double nilai3) {
        return hasil = a.format ((nilai1 + nilai2 + nilai3) / 3);
    }

}
   
