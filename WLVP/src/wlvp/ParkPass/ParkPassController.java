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
public class ParkPassController implements ActionListener {
    private static ParkPassView parkPassView;
    private static ParkPass parkPass;
    
    
    public static void goToParkPassView(){
        parkPassView.setVisible(true);
    }
    
    public static ParkPass createNewParkPass(int id){
        ParkPass newParkPass = new ParkPass(id);
        return newParkPass;
        
    }
    
    
    public ParkPass getParkPass(){
        return parkPass;
    }
    
    public void AddActionListeners(){
        parkPassView.addCreditsButton.addActionListener(this);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        
        
    }
    
  
}


