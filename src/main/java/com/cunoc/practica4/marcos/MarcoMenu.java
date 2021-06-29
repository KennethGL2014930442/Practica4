package com.cunoc.practica4.marcos;

import com.cunoc.practica4.laminas.LaminaMenu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Toolkit;

public class MarcoMenu extends JFrame {
    
    public MarcoMenu(){
        setTitle("Bienvenido a Serpientes y Escaleras");
        setSize(400,400);
        this.setLocationRelativeTo(null);
        
        LaminaMenu menu2 = new LaminaMenu();
        //FlowLayout orden = new FlowLayout(FlowLayout.TRAILING);
        add(menu2);
        //pack();
        
        
        /*JMenu menu = new JMenu("Archivo");
        //menu.add(accionJugar);
        JMenuBar barraMenu = new JMenuBar();
        barraMenu.add(menu);
        setJMenuBar(barraMenu);*/
    }
    
}


