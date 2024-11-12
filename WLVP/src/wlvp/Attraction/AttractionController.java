/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wlvp.Attraction;

import java.util.ArrayList;
import wlvp.AccountCreation.Guest;

/**
 *
 * @author Daniel
 */
public class AttractionController {
    public static AttractionView attractionView;
    public static AbstractAttraction attraction;
    public static ArrayList<AbstractAttraction> attractionList;
    
    
    
    
   public void populateListView(ArrayList<AbstractAttraction> listOfAttractions){
       
       
       for(int i = 0; i < listOfAttractions.size(); i++){
           attractionView.getRestaurantListModel().addElement(listOfAttractions.get(i));
          
       }
       
   }
   public static void openAttractionListView(){
       AttractionView view = new AttractionView();
       view.setVisible(true);
   }
   
}
