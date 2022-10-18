/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.probando.mavenproject1;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Admn
 */
public class Mavenproject1 extends JFrame{

    public Mavenproject1(){
        setSize(500,500); //Asignar tamaño
        setDefaultCloseOperation(EXIT_ON_CLOSE);//Nos permite cerrar la ventana
        //setLocation(100,200);//Establecemos la posición inicial de la ventana
        //(Trabaja con pixeles)
        //setBounds(100, 200, 500, 500);
        
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.BLACK);
        setTitle("Mi proyecto");//Titulo del proyecto
        
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        JPanel panel = new JPanel();//Creamos el panel
        //panel.setBackground(Color.cyan);
        panel.setLayout(null);//Desactivar el diseño
        this.getContentPane().add(panel);//Agregamos el panel a la ventana
        
        JLabel etiqueta = new JLabel("Hola");
        etiqueta.setBounds(50, 10, 100, 30);
        panel.add(etiqueta);
        
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setText("Esta es mi etiqueta");
        etiqueta2.setBounds(100, 10, 150, 30);
        etiqueta2.setForeground(Color.red);//Cambiar el color de nuestra etiqueta}
        etiqueta2.setOpaque(true);//Establecemos pintar
        etiqueta2.setBackground(Color.WHITE);//Cambiar fondo (Si queremos que funcione, debemos agregar el método setOpaque())
        panel.add(etiqueta2);
    }
        
}
