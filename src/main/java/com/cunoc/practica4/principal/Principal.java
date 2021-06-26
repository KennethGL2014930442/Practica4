package com.cunoc.practica4.principal;

import com.cunoc.practica4.tablero.Bienvenida;
import javax.swing.JFrame;

public class Principal {
   
    public static void main(String[] args){
        Bienvenida bienvenida = new Bienvenida();
        
        bienvenida.setVisible(true);
        bienvenida.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
