/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wlvp.Attraction;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import wlvp.Itinerary.EventSlot;
import wlvp.WLVP;


/**
 * @author Daniel
 * @author Grant
 */
public class AttractionController {
    private static boolean initialized = false;
    public static AttractionView attractionView;
    public static AbstractAttraction attraction;
    public static AttractionDetailsView detailListView;
    public static ArrayList<AbstractAttraction> attractionList = new ArrayList<>();
    public static DefaultListModel<AbstractAttraction> rideListModel = new DefaultListModel<>();
    public static DefaultListModel<AbstractAttraction> restaurantListModel = new DefaultListModel<>();

    
    /**
     * Initializes the AttractionController
     */
    public static void initialize(){
        assert(!initialized);

        initialized = true;
        
        attractionView = new AttractionView();
        
        detailListView = new AttractionDetailsView();
        
        populateAttractionList();
        populateListModels();
    }
    
    
    /**
     * Navigates to the AttractionView
     */
    public static void navigateToAttractionView() {
        WLVP.closeOtherWindows();
        attractionView.setVisible(true);      
    }
    
    
    /**
     * Navigates to the AttractionView (parameterized)
     * @param method The method required to navigate out of the attractions menu
     */
    public static void navigateToAttractionView(Runnable method) {
        WLVP.closeOtherWindows();
        attractionView.setReturnMethod(method);
        attractionView.setVisible(true);
    }
   
    
    /**
     * Navigates to the AttractionDetailsView
     * @param method The method required to navigate out of the details menu 
     * @param selectedAttraction The selected attraction
     */
    public static void navigateToAttractionDetailsView(Runnable method, AbstractAttraction selectedAttraction){
        if (selectedAttraction == null) {
            javax.swing.JOptionPane.showMessageDialog(null, "No attraction selected!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
        }
    
        WLVP.closeOtherWindows();
        attraction = selectedAttraction; // Set the selected attraction
        detailListView.setReturnMethod(method);
        detailListView.updateDetailsView();
        detailListView.setVisible(true);
    }
   
    
    /**
     * Hides all related windows
     */
    public static void hideAllWindows() {
        attractionView.setVisible(false);
        detailListView.setVisible(false);
    }
   
    public static void populateAttractionList(){

        AbstractAttraction a1 = new Ride(1,true,"Happy Fun Loopy Time", RideType.Rollercoaster);
        AbstractAttraction a2 = new Ride(2,true,"Whack-a-Mole",RideType.PrizeGames);
        AbstractAttraction a3 = new Ride(3,true,"House Of Mirrors",RideType.ThrillRide);
        AbstractAttraction a4 = new Ride(4,true,"Rolly Polly Olly", RideType.KidRide);
        AbstractAttraction a5 = new Ride(5,true,"Splash Lash", RideType.WaterParkRide);

        AbstractAttraction r6 = new Restaurant(6,true, "Colin's Quick Colon Carvers",RestaurantType.QuickService);
        AbstractAttraction r7 = new Restaurant(7,true, "Fredrick's Fancy Foods", RestaurantType.SitDown);
        AbstractAttraction r8 = new Restaurant(8,true, "Carl's Casual Coffee Cavern", RestaurantType.Casual);

        attractionList.add(a1);
        attractionList.add(a2);
        attractionList.add(a3);
        attractionList.add(a4);
        attractionList.add(a5);

        attractionList.add(r6);
        attractionList.add(r7);
        attractionList.add(r8);


    }
    public static void populateListModels(){
        for(int i = 0; i < attractionList.size(); i++){
            if(attractionList.get(i).getClass().isAssignableFrom(Restaurant.class) ){
                restaurantListModel.addElement(attractionList.get(i));


            }
            else{
                rideListModel.addElement(attractionList.get(i));
            }
        }
    }
    public static DefaultListModel<AbstractAttraction> getRideListModel(){
        return rideListModel;


    }
    public static DefaultListModel<AbstractAttraction> getRestaurantListModel(){
        return restaurantListModel;
    }
}
