package org.kia.kiaapp.bean;

import jdk.nashorn.internal.ir.Terminal;
import org.kia.kiaapp.AirportTerminal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class KiaAirportBean {
    private String airportName;
    private String airportAddress;
    @Autowired
    private AirportTerminal airportTerminals;

    @Autowired
    public KiaAirportBean(@Value("Rajeev Gandhi Int Airport") String airportName, @Value("Hyderabad") String airportAddress , AirportTerminal airportTerminals){
        System.out.println("KiaAirport COnstructor is invoked");

        this.airportName = airportName;
        this.airportAddress = airportAddress;
        this.airportTerminals = airportTerminals;
        System.out.println(airportName+"\n"+airportAddress+"\n"+airportTerminals);
    }

    public void setAirportName(String airportName){
        this.airportName = airportName;
    }

    public void setAirportAddress(String airportAddress){
        this.airportAddress = airportAddress;
    }

    public void setAirportTerminals(AirportTerminal airportTerminals){
        this.airportTerminals = airportTerminals;
    }

    public String getAirportName(){
        return airportName;
    }

    public String getAirportAddress(){
        return airportAddress;
    }

//    public AirportTerminal getAirportTerminals(){
//        return airportTerminals;
//    }


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
