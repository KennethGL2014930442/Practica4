package com.cunoc.practica4.laminas;

//import com.cunoc.practica4.botones.AccionBotonIrAMenu;
import com.cunoc.practica4.marcos.MarcoMenu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.awt.geom.Rectangle2D;
import javax.imageio.ImageIO;
import java.io.*;
//import javax.imageio.*;

public class LaminaBienvenida extends JPanel {
    
    //AccionBotonIrAMenu botonVaMenu = new AccionBotonIrAMenu();
    JButton botonVaMenu = new JButton("ir a menu");
    private Image imagen;
    
    public LaminaBienvenida(){ 
        
        OyenteNuevo miOyente = new OyenteNuevo();
        botonVaMenu.addActionListener(miOyente);
        
        try{
            imagen = ImageIO.read(new File("src/main/java/com/cunoc/practica4/laminas/imagenbienvenda.jpg"));
        }
        catch(IOException e){
            System.out.println("La imagen no se ha encontrado");
        }         
    }
    
    private class OyenteNuevo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            MarcoMenu menu = new MarcoMenu();
            menu.setVisible(true);    
        }  
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        int anchuraImagen = imagen.getWidth(this);
        int alturaImagen = imagen.getHeight(this);
        
        g.drawImage(imagen, 0, 35, 800, 400, null);
        
        Graphics2D g2 = (Graphics2D) g;
        g2.setFont(new Font("Times New Roman", Font.BOLD, 28));
        g2.drawString("Bienvenido al juego de Serpientes y Escaleras. DISFRUTALO!", 0, 25);
        
        botonVaMenu.setBounds(650, 350, 100, 40);
        add(botonVaMenu);
        //botonVaMenu.setBounds(650, 370, 100, 20);
        //add(botonVaMenu);
    }
}
