/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weather.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import weather.app.model.Station;

/**
 *
 * @author ZiOS
 */
public class StationService {

    static final List<Station> STATIONS;
    
    static  {
        STATIONS = new ArrayList<>();
    }
    public StationService() {
    }

    public void addStation(Station station) {
        STATIONS.add(station);
    }
    
    public List<Station> getStations() {
        return STATIONS;
    }

    public Station getStationById(UUID stationID) {
        return STATIONS.stream().filter(s -> s.getId().equals(stationID)).findFirst().get();
    }
    
    public void saveState() {
        
    }
    
}
