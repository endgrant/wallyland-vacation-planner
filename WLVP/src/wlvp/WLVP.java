package wlvp;

import wlvp.ParkPass.ParkPassView;

/**
 * @author Grant
 */
public class WLVP {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParkPassView passView = new ParkPassView();
        passView.setSize(600, 600);
        passView.setVisible(true);
    }
}
