/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weather.app.model;

import java.util.Date;

/**
 *
 * @author ZiOS
 */
public class Reading {
    
    private Date date;
    private Double highestTemp;
    private Double lowestTemp;
    private Double precipitation;
    private Double humidity;
    private Double wind;

    public Reading(Date date, Double highestTemp, Double lowestTemp, Double precipitation, Double humidity, Double wind) {
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
    
    
    
}
