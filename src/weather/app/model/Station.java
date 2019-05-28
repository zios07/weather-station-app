/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weather.app.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author ZiOS
 */
public class Station {
    
    private UUID id;
    private String label;
    private List<Reading> readings;
    
    public Station() {
        this.id = UUID.randomUUID();
        this.readings = new ArrayList<>();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Reading> getReadings() {
        return readings;
    }

    public void setReadings(List<Reading> readings) {
        this.readings = readings;
    }

    public void setId(UUID id) {
        this.id = id;
    }
    
    public UUID getId() {
        return this.id;
    }
}
