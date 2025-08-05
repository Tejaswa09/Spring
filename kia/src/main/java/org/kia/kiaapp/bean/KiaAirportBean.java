package org.kia.kiaapp.bean;

import org.springframework.stereotype.Component;

import java.util.Objects;


public class KiaAirportBean {
    private String airportName;
    private String airportAddress;
    private int airportTerminals;

    public void setAirportName(String airportName){
        this.airportName = airportName;
    }

    public void setAirportAddress(String airportAddress){
        this.airportAddress = airportAddress;
    }

    public void setAirportTerminals(int airportTerminals){
        this.airportTerminals = airportTerminals;
    }

    public String getAirportName(){
        return airportName;
    }

    public String getAirportAddress(){
        return airportAddress;
    }

    public int getAirportTerminals(){
        return airportTerminals;
    }


    @Override
    public String toString() {
        return "AirportName=" + airportName + "\"AirportAddress=" + airportAddress + "\"AirportTerminals=" + airportTerminals;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        KiaAirportBean that = (KiaAirportBean) o;
        return airportTerminals == that.airportTerminals && Objects.equals(airportName, that.airportName) && Objects.equals(airportAddress, that.airportAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airportName, airportAddress, airportTerminals);
    }

    public void airportDetails() {
        System.out.println("Airport name="+this.getAirportName()+"\nAirport Address="+this.getAirportAddress()+"\nAirport Terminals="+this.airportTerminals);
    }


}
