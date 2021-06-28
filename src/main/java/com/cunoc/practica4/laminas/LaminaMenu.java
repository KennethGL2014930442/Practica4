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
        setLayout(new BorderLayout());
        
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
        
        milamina2 = new JPanel();
        
        milamina2.setLayout(new GridLayout(4,0));
        
        ponerBotones("jugar");
        ponerBotones("aggUsuario");
        ponerBotones("reportes");
        ponerBotones("salir");
        /*milamina2.add(jugar);
        milamina2.add(aggUsuario);
        milamina2.add(reportes);
        milamina2.add(salir);*/
        
        add(milamina2, BorderLayout.CENTER);
    }
    
    private void ponerBotones(String rotulo){
        JButton botones = new JButton(rotulo);
        
        milamina2.add(botones);   
    }
    
    private JPanel milamina2;
    
}
