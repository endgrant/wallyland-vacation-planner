/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wlvp.ParkPass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Daniel
 */
public class ParkPassController {
    private static ParkPassView parkPassView;
    private static ParkPass parkPass;
    
    
    public static void goToParkPassView(){
        parkPassView = new ParkPassView();
        parkPassView.setSize(600, 600);
        parkPassView.setVisible(true);
    }
    
    public static ParkPass createNewParkPass(int id){
        ParkPass newParkPass = new ParkPass(id);
        parkPass = newParkPass;
        return newParkPass;
        
    }
    public static void addCredits(int amount){
        parkPass.purchaseCredits(amount);
        parkPassView.parsePass(parkPass);
       
        
    }
    
    
    public ParkPass getParkPass(){
        return parkPass;
    }
    
  
        
    
    
  
}


