package org.kia.kiaapp.config;

import org.kia.kiaapp.bean.KiaAirportBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "org.kia.kiaapp")
public class AirportConfiguration {


    @Bean
    public List<String> getCountries(){
        List<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("America");

        return countries;
    }
    @Bean
    public List<String> getCities(){
        List<String> cities = new ArrayList<>();
        cities.add("Bangalore");
        cities.add("Sindhanoor");

        return cities;
    }
}
