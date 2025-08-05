package com.spring.task.configuration;

import com.spring.task.dto.TaskDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
@ComponentScan(basePackages = "com.spring.task")
public class TaskConfiguration {

    @Bean("int1")
    public Integer getInteger(){
        return 45;
    }

    @Bean("int2")
    public Integer getInteger1(){
        return 99;
    }

    @Bean
    public Integer getIntegr3(){
        return 100;
    }
    @Bean("T")
    public Character getChar(){
        return 'T';
    }

    @Bean("E")
    public Character getChar2(){
        return 'E';
    }

    @Bean("J")
    public Character getChar3(){
        return 'J';
    }

    @Bean("A")
    public Character getChar4(){
        return 'A';
    }

    @Bean
    public List<String> getName(){
        List<String> name = new ArrayList<>();
        name.add("T");
        name.add("E");
        name.add("J");
        name.add("A");

        return name;
    }

    @Bean("number")
    public List<Integer> getNumber(){
        List<Integer> number = new ArrayList<>();
        number.add(7);
        number.add(8);
        number.add(9);
        number.add(9);
        number.add(4);
        number.add(5);
        number.add(5);
        number.add(8);
        number.add(1);
        number.add(8);
        return number;
    }

    @Bean
    public Set<String> getNameBySet(){
        Set<String> name = new HashSet<>();
        name.add("T");
        name.add("E");
        name.add("J");
        name.add("A");

        return name;
    }

    @Bean("number")
    public Set<Integer> getNumberBySet(){
        Set<Integer> number = new HashSet<>();
        number.add(7);
        number.add(8);
        number.add(9);
        number.add(9);
        number.add(4);
        number.add(5);
        number.add(5);
        number.add(8);
        number.add(1);
        number.add(8);

        return number;
    }

    @Bean("hashMap")
    public HashMap<String,String> getKeyMap(){
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("Key","Value");
        return map;
    }

    @Bean("hashMap1")
    public HashMap<String,Long> getKeyMap1(){
        HashMap<String,Long> map = new HashMap<String,Long>();
        map.put("Key",7899455818L);
        return map;
    }

    @Bean("hashMap3")
    public HashMap<Long,String> getKeyMap3(){
        HashMap<Long,String> map = new HashMap<Long,String>();
        map.put(7899455818L,"Value");
        return map;
    }

    @Bean("hashMap4")
    public HashMap<Boolean,String> getKeyMap4(){
        HashMap<Boolean,String> map = new HashMap<Boolean,String>();
        map.put(Boolean.TRUE,"Value");
        return map;
    }

    @Bean("hashMap5")
    public HashMap<String,Boolean> getKeyMap5(){
        HashMap<String,Boolean> map = new HashMap<String,Boolean>();
        map.put("Key",Boolean.FALSE);
        return map;
    }

    @Bean("getListofName")
    public List<TaskDto> getListofName(){
        List<TaskDto> dtos = new ArrayList<>();
        dtos.add(new TaskDto("Tejaswa D",7899455818L));
        dtos.add(new TaskDto("Sm",7899455819L));
        return dtos;

    }


}
