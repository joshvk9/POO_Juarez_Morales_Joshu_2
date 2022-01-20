/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._ejemplos;

/**
 *
 * @author Usuario
 */
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.lang.Thread.sleep;


public class Tortuga extends Thread {
    
   //metodo para que corra             
     public void run(){
         for(int i = 0; i < 100; i++){
             System.out.println("Avanza la Tortuga " +i);
             //cuando llegue a 100 se mime wiii
             try{
                 sleep(300);//recordar que son ms
             }catch(InterruptedException ex){
                 Logger.getLogger(Tortuga.class.getName()).log(Level.SEVERE,null,ex);
                 
             }
         }
         System.out.println("Termino Tortuga");
     }   
    
}
