package com.cunoc.practica4.marcos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MarcoTablero extends JFrame {
    
    JLabel casilla0, casilla1, casilla2;
    Color casillas, fondo, jugador;
    
    public MarcoTablero(){
        super("Serpientes y Escaleras");
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
    }
}
