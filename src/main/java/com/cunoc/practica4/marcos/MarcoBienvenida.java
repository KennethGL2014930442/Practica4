package com.cunoc.practica4.marcos;

import com.cunoc.practica4.laminas.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Toolkit;

public class MarcoBienvenida extends JFrame{
    
    public MarcoBienvenida(){
        Toolkit mipantalla=Toolkit.getDefaultToolkit();
	Dimension tamanioPantalla=mipantalla.getScreenSize();
	int alturaPantalla=tamanioPantalla.height;
	int anchoPantalla=tamanioPantalla.width;
        
        setTitle("Serpientes y Escaleras");
        setSize(anchoPantalla/2, alturaPantalla/2);
        setLocation(anchoPantalla/4, alturaPantalla/4);        
        
        LaminaBienvenida escritura = new LaminaBienvenida();
        add(escritura);
        LaminaBienvenida menu = new LaminaBienvenida();
        add(menu);
    }    
}
