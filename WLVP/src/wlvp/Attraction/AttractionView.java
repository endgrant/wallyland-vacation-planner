/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package wlvp.Attraction;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;


/**
 *
 * @author Daniel
 */
public class AttractionView extends javax.swing.JFrame {
   public  DefaultListModel<String> listModel = new DefaultListModel<>();
    /**
     * Creates new form AttractionVIew
     */
    
    public AttractionView() {
        initComponents();
        // Create a DefaultListModel
        

  
        
   
        
        
        
    }
    public JList<String> getRestaurantListViewComp(){
        return restaurantList;
    }
    
   /* public static void generateAttractions(){
        ArrayList<AbstractAttraction> list = new ArrayList<>();
        AbstractAttraction r1 = new Ride(1,true,"Rolly Polly Olly" , RideType.Rollercoaster);
        AbstractAttraction r2 = new Ride(2,true,"Whacka Mole", RideType.PrizeGames);
        AbstractAttraction r3 = new Ride(3,true,"Zoo Pals", RideType.KidRide);
        AbstractAttraction r4 = new Restaurant(4,true,"Big Belly Burger", RestaurantType.QuickService);
        AbstractAttraction r5 = new Restaurant(5,true,"Fried Fancy", RestaurantType.SitDown);
        AbstractAttraction r6 = new Restaurant(6,true,"Jitters", RestaurantType.Casual);
        list.add(r1);
        list.add(r2);
        list.add(r3);
        list.add(r4);
        list.add(r5);
        list.add(r6);
        
        model2.addElement(list.get(3));
        model2.addElement(list.get(4));
        model2.addElement(list.get(5));
        
        model.addElement(list.get(0));
        model.addElement(list.get(1));
        model.addElement(list.get(2));
        
        
    }
    
    */
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rideListLabel = new javax.swing.JLabel();
        restaurantListLabel = new javax.swing.JLabel();
        rideScrollPane = new javax.swing.JScrollPane();
        rideList = new javax.swing.JList<>();
        restaurantScrollPane = new javax.swing.JScrollPane();
        restaurantList = new javax.swing.JList<>();
        attractionLabel = new javax.swing.JLabel();
        showDetailsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rideListLabel.setText("Rides");

        restaurantListLabel.setText("Restaurants");

        rideList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        rideScrollPane.setViewportView(rideList);

        restaurantList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        restaurantScrollPane.setViewportView(restaurantList);

        attractionLabel.setText("Attractions");

        showDetailsButton.setText("Show Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(rideListLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(restaurantListLabel)
                .addGap(75, 75, 75))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(rideScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(restaurantScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(attractionLabel)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(showDetailsButton)
                        .addGap(131, 131, 131))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(attractionLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rideListLabel)
                    .addComponent(restaurantListLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rideScrollPane)
                    .addComponent(restaurantScrollPane))
                .addGap(18, 18, 18)
                .addComponent(showDetailsButton)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel attractionLabel;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JList<String> restaurantList;
    private javax.swing.JLabel restaurantListLabel;
    private javax.swing.JScrollPane restaurantScrollPane;
    public javax.swing.JList<String> rideList;
    private javax.swing.JLabel rideListLabel;
    private javax.swing.JScrollPane rideScrollPane;
    public javax.swing.JButton showDetailsButton;
    // End of variables declaration//GEN-END:variables
}
