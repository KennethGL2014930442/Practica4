package com.cunoc.practica4.principal;

import com.cunoc.practica4.marcos.MarcoBienvenida;
import java.awt.Color;
import javax.swing.JFrame;

public class Principal {
   
    public static void main(String[] args){
        MarcoBienvenida bienvenida = new MarcoBienvenida();
        bienvenida.setVisible(true);
        bienvenida.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }    
}
