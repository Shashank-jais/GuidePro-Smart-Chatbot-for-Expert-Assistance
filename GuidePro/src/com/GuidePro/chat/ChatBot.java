package com.GuidePro.chat;

import java.util.HashMap;
import java.util.Map;

import com.GuidePro.nlp.*;
public class ChatBot {
	private Map<String , Integer> intent_index;
	
	public ChatBot() {
		intent_index = new HashMap<>();
		intent_index.put("GetDestinationInfo",1);
        intent_index.put("GetTopAttractions",2);
        intent_index.put("GetBestTimeToVisit",3);
        intent_index.put("GetLocalTransportation",4);
        intent_index.put("GetAccommodationDining",5);
        intent_index.put("PlanItinerary",6);
        intent_index.put("GetCurrencyLanguageInfo",7);
        intent_index.put("GetTravelRequirements",8);
        intent_index.put("GetWeatherInfo",9);
        intent_index.put("GetEmergencyInfo",10);
	}
	public String processInput(String input) {
	        // Basic input processing (to be expanded)
	    	System.out.println("Processing: " + input);
	    	IntentClassifier resp = new IntentClassifier();
	    	String intent= resp.classifyIntent(input);
	    	int intent_index_number = intent_index.getOrDefault(intent, 11);
	    	
	    	switch(intent_index_number) {
	    	case 1:
	    		
	    		break;
	    	case 2:
	    		break;
	    	case 3:
	    		break;
	    	case 4:
	    		break;
	    	case 5:
	    		break;
	    	case 6:
	    		break;
	    	case 7:
	    		break;
	    	case 8:
	    		break;
	    	case 9:
	    		break;
	    	case 10:
	    		break;
	    	case 11:
	    		break;
	    	}
	        return intent;
	 }
	
}
