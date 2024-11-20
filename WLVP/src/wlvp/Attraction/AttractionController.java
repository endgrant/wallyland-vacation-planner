/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wlvp.Attraction;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import static wlvp.Attraction.AttractionView.attractionList;


/**
 *
 * @author Daniel
 */
public class AttractionController {
    public static AttractionView attractionView;
    public static AbstractAttraction attraction;
    public static AttractionDetailsView detailListView;
    public static ArrayList<AbstractAttraction> attractionList = new ArrayList<>();
    public static DefaultListModel<AbstractAttraction> rideListModel = new DefaultListModel<>();
   public static DefaultListModel<AbstractAttraction> restaurantListModel = new DefaultListModel<>();
    

   public static void openAttractionListView(){
       
       AttractionView view = new AttractionView();
       
       
       view.setVisible(true);
   }
   
   public static void initialize(){
       populateAttractionList();
       populateListModels();
   }
   public static void navigateToAttractionDetailsView(){
       
       AttractionDetailsView detailView = new AttractionDetailsView();
       detailView.setVisible(true);
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
