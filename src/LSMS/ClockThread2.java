/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LSMS;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class ClockThread2 extends Thread{
    
    String time;
    public void run(){
    try {
        while(true){
            
        time = "" + new Date();
       
       
             Student_Update.clo.setText(time);
             
                Thread.sleep(1000);
                
            } }
        catch (InterruptedException ex) {
                Logger.getLogger(ClockThread2.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }
    

