package com.cunoc.practica4.laminas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LaminaBienvenida extends JPanel implements ActionListener {
    
    JButton botonVaMenu = new JButton("ir a menu");
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
        g2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        g2.drawString("Bienvenido al juego de Serpientes y Escaleras", 150, 100);
    }
    
    public LaminaBienvenida(){
        
        setLocation(200,100);
        add(botonVaMenu);
        
        botonVaMenu.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
      
    }
    
}
