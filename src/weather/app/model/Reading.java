/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weather.app.model;

import java.util.Date;
import java.util.UUID;

/**
 *
 * @author ZiOS
 */
public class Reading {

    private UUID id;
    private Date date;
    private Double highestTemp;
    private Double lowestTemp;
    private Double precipitation;
    private Double humidity;
    private Double wind;

    public Reading(Date date, Double highestTemp, Double lowestTemp, Double precipitation, Double humidity, Double wind) {
        this.id = UUID.randomUUID();
        this.date = date;
        this.highestTemp = highestTemp;
        this.lowestTemp = lowestTemp;
        this.precipitation = precipitation;
        this.humidity = humidity;
        this.wind = wind;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getHighestTemp() {
        return highestTemp;
    }

    public void setHighestTemp(Double highestTemp) {
        this.highestTemp = highestTemp;
    }

    public Double getLowestTemp() {
        return lowestTemp;
    }

    public void setLowestTemp(Double lowestTemp) {
        this.lowestTemp = lowestTemp;
    }

    public Double getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(Double precipitation) {
        this.precipitation = precipitation;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public Double getWind() {
        return wind;
    }

    public void setWind(Double wind) {
        this.wind = wind;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Reading && this.id.equals(((Reading) obj).getId());
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
