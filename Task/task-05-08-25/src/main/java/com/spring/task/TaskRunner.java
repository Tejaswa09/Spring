package com.spring.task;

import com.spring.task.configuration.TaskConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class TaskRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(TaskConfiguration.class);
        System.out.println("Task-1\n"+applicationContext.getBean("int1",Integer.class));

        System.out.println("Task-2\n"+applicationContext.getBean("int2",Integer.class));

        System.out.println("Task-3\n"+applicationContext.getBean("getIntegr3",Integer.class));

        System.out.println("Task-4\n"+applicationContext.getBean("T",Character.class));

        System.out.println("Task-5\n"+applicationContext.getBean("E",Character.class));

        System.out.println("Task-6\n"+applicationContext.getBean("J",Character.class));

        System.out.println("Task-7\n"+applicationContext.getBean("A",Character.class));

        System.out.println("Task-8\n"+applicationContext.getBean("getName", List.class));

        System.out.println("Task-9\n"+applicationContext.getBean("number",List.class));

        System.out.println("Task-10\n"+applicationContext.getBean("getNameBySet", Set.class));

        System.out.println("Task-10 by set\n"+applicationContext.getBean("number", Set.class));

        System.out.println("Task-11\n"+applicationContext.getBean("hashMap", HashMap.class));

        System.out.println("Task-12\n"+applicationContext.getBean("hashMap1", HashMap.class));

        System.out.println("Task-13\n"+applicationContext.getBean("hashMap3", HashMap.class));

        System.out.println("Task-14\n"+applicationContext.getBean("hashMap4", HashMap.class));

        System.out.println("Task-15\n"+applicationContext.getBean("hashMap5", HashMap.class));
    }

}
