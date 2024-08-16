package com.GuidePro.data;

import java.util.HashMap;
import java.util.Map;

public class DestinationData {
    private Map<String, String> destinations;

    public DestinationData() {
        destinations = new HashMap<>();
        // Initial data
        destinations.put("Paris", "City of Lights, great for romantic getaways.");
        destinations.put("Tokyo", "Experience the mix of tradition and modernity.");
    }

    public String getDestinationInfo(String place) {
        return destinations.getOrDefault(place, "Sorry, I don't have information on that destination.");
    }
}
