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
    private ParkPassView parkPassView;
    private ParkPass parkPass;
    
    public ParkPassController(ParkPass parkPass){
        this.parkPass = parkPass;
        parkPassView = new ParkPassView(this);
        parkPassView.setVisible(true);
        
        
        
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


