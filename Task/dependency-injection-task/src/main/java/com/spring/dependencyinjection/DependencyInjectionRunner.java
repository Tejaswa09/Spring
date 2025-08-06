package com.spring.dependencyinjection;

import com.spring.dependencyinjection.config.DependencyInjectionConfiguration;

import com.spring.dependencyinjection.dtos.CoffeeEstateDto.CoffeeEstateDto;
import com.spring.dependencyinjection.dtos.book.Book;
import com.spring.dependencyinjection.dtos.cardto.CarDto;
import com.spring.dependencyinjection.dtos.collegedto.CollegeDto;
import com.spring.dependencyinjection.dtos.computerDto.ComputerDto;
import com.spring.dependencyinjection.dtos.database.DatabaseService;
import com.spring.dependencyinjection.dtos.emailService.EmailService;
import com.spring.dependencyinjection.dtos.hospitalDto.HospitalDto;
import com.spring.dependencyinjection.dtos.instutedto.InstituteDto;
import com.spring.dependencyinjection.dtos.movie.Movie;
import com.spring.dependencyinjection.dtos.music.MusicPlayer;
import com.spring.dependencyinjection.dtos.orderProcessor.OrderProcessor;
import com.spring.dependencyinjection.dtos.restorant.RestorentDto;
import com.spring.dependencyinjection.dtos.team.Team;
import com.spring.dependencyinjection.dtos.universityDto.UnversityDto;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext =new AnnotationConfigApplicationContext(DependencyInjectionConfiguration.class);
        System.out.println("Task1\n"+applicationContext.getBean(CollegeDto.class));

        System.out.println("Task-2\n"+applicationContext.getBean(InstituteDto.class));

        System.out.println("Task-3\n"+applicationContext.getBean(CoffeeEstateDto.class));

        System.out.println("Task-4\n"+applicationContext.getBean(HospitalDto.class));

        System.out.println("Task-5\n"+applicationContext.getBean(RestorentDto.class));

        System.out.println("Task-6\n"+applicationContext.getBean(UnversityDto.class));

        System.out.println("Task-7\n"+applicationContext.getBean(CarDto.class));

        System.out.println("Task-8\n"+applicationContext.getBean(ComputerDto.class));

        System.out.println("Task-9\n"+applicationContext.getBean(OrderProcessor.class));

        System.out.println("Task-10\n"+applicationContext.getBean(EmailService.class));

        System.out.println("Task-11\n"+applicationContext.getBean(Movie.class));

        System.out.println("Task-12\n"+applicationContext.getBean(DatabaseService.class));

        System.out.println("Task-13\n"+applicationContext.getBean(Team.class));

        System.out.println("Task-14\n"+applicationContext.getBean(Book.class));

        System.out.println("Task-15\n"+applicationContext.getBean(MusicPlayer.class));



    }
}
