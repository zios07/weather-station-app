/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weather.app.service;

import java.util.ArrayList;
import java.util.List;
import weather.app.model.Station;

/**
 *
 * @author ZiOS
 */
public class StationService {

    static final List<Station> stations;
    
    static  {
        stations = new ArrayList<>();
    }
    public StationService() {
    }

    public void addStation(Station station) {
        this.stations.add(station);
    }
    
    public List<Station> getStations() {
        return this.stations;
    }
    
}
