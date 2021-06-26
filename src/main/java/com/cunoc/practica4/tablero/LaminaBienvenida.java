package com.cunoc.practica4.tablero;

import javax.swing.*;
import java.awt.*;

public class LaminaBienvenida extends JPanel {
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
        g2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        g2.drawString("Bienvenido al juego de Serpientes y Escaleras", 150, 100);
    }
}
