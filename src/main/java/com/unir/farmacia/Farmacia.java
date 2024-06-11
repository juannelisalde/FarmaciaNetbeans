/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.unir.farmacia;

import com.unir.farmacia.views.FarmaciaView;

/**
 *
 * @author Juan David Naranjo
 */
public class Farmacia {
    public static void main(String[] args) {        
        FarmaciaView pantalla = new FarmaciaView();
        pantalla.setVisible(true);
        pantalla.setTitle("Pedido");
        pantalla.setLocationRelativeTo(null);
    }
}
