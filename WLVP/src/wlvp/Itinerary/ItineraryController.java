/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wlvp.Itinerary;

import java.util.ArrayList;
import wlvp.Attraction.AttractionDetailsView;
import wlvp.Attraction.AttractionView;

/**
 *
 * @author Miranda
 */
public class ItineraryController {

    private static boolean initialized;
    private static Itinerary itinerary;
    private static ItineraryView itineraryView;
    private static AttractionView attractionView; 
    private static AttractionDetailsView attractionDetailsView; 
    private static ArrayList<EventSlot> events;

    /**
     * Initializes the itinerary controller
     */
    public static void initialize() {
        assert(!initialized);
        
        initialized = true;
        itinerary = new Itinerary();
        
        itineraryView = new ItineraryView();
        itineraryView.setSize(600, 600);
    }

    /**
     * Updates view to show the itinerary contents
     */
    public void showItinerary() {
        events = itinerary.getEvents();
        itineraryView.updateItineraryList(events);
    }

    
    /**
     * Navigates to the Itinerary view
     */
    public static void navigateToItinerary() {
        itineraryView.setVisible(true);
    }
    
    /**
     * Removes EventSlot from Itinerary and updates view accordingly
     * @param eventToDelete
     */
    public static void removeEvent(EventSlot eventToDelete){
        itinerary.removeEvent(eventToDelete);  
        events = itinerary.getEvents();   
        itineraryView.updateItineraryList(events);
    }

}
