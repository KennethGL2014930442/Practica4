package com.cunoc.practica4.laminas;

import javax.swing.*;
import java.awt.*;

public class LaminaMenu extends JPanel{
    /*private JButton jugar = new JButton("Iniciar juego");
    private JButton aggUsuario = new JButton("Agregar jugadores");
    private JButton reportes = new JButton("Reportes");
    private JButton salir = new JButton("Salir");*/
    
    public LaminaMenu(){
        //setLayout(new FlowLayout(FlowLayout.RIGHT, 150, 50));
        /*setLayout(new BorderLayout());
        
        /*jugar.setEnabled(false);
        add(jugar, BorderLayout.CENTER);
        aggUsuario.setEnabled(false);
        add(aggUsuario, BorderLayout.CENTER);
        reportes.setEnabled(false);
        add(reportes, BorderLayout.CENTER);
        salir.setEnabled(false);
        add(salir, BorderLayout.CENTER);*/
        /*add(new JButton("Juego")/*, BorderLayout.NORTH);
        add(new JButton("Agregar usuarios")/*, BorderLayout.CENTER);
        add(new JButton("Reportes")/*, BorderLayout.WEST);
        add(new JButton("Salir")/*, BorderLayout.SOUTH);*/
        
       /* milamina2 = new JPanel();
        
        milamina2.setLayout(new GridLayout(4,0));
        
        ponerBotones("jugar");
        ponerBotones("aggUsuario");
        ponerBotones("reportes");
        ponerBotones("salir");
        /*milamina2.add(jugar);
        milamina2.add(aggUsuario);
        milamina2.add(reportes);
        milamina2.add(salir);*/
        
        /*add(milamina2, BorderLayout.CENTER);*/
        
        
        
        JMenu archivo =new JMenu("Archivo");
        JMenu agregar = new JMenu("Agregar jugadores");
        
        JMenuItem iniciar = new JMenuItem("Iniciar nuevo juego");
        //JMenuItem agregar = new JMenuItem("Agregar jugadores");
        JMenuItem reportes = new JMenuItem("Reportes de los juegos");
        JMenuItem salir = new JMenuItem("Salir del juego");
        JMenuItem editar = new JMenuItem("Editar jugadores");
        
        
        archivo.add(iniciar);
        archivo.addSeparator();
        agregar.add(editar);
        archivo.add(agregar);
        archivo.add(reportes);
        archivo.addSeparator();
        archivo.add(salir);
        JMenuBar barramenu = new JMenuBar();
        barramenu.add(archivo);
        
    }
    
    private void ponerBotones(String rotulo){
        JButton botones = new JButton(rotulo);
        
        milamina2.add(botones);   
    }
    
    private JPanel milamina2;
    
}
