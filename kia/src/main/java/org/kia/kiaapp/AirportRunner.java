package org.kia.kiaapp;


import org.kia.kiaapp.bean.KiaAirportBean;
import org.kia.kiaapp.config.AirportConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AirportRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AirportConfiguration.class);
        KiaAirportBean bean=applicationContext.getBean(KiaAirportBean.class);

        bean.setAirportName("Kempe gowda International Airport");
        bean.setAirportAddress("Bangalore");
        bean.setAirportTerminals(4);

        bean.airportDetails();

        List<String> list =applicationContext.getBean("getCities",List.class);

        System.out.println(list);
    }
}
