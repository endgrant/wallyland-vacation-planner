package wlvp;

import wlvp.AccountCreation.AccountCreationGUI;
import wlvp.ParkPass.ParkPassView;

/**
 * @author Grant
 */
public class WLVP {
    public static AccountCreationGUI accountView;
    public static ParkPassView passView;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        accountView = new AccountCreationGUI();
        ParkPassView passView = new ParkPassView();
        
        accountView.setSize(600, 600);
        accountView.setVisible(true);
    }
}
