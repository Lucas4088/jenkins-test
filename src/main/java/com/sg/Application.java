package com.sg;

import com.sg.core.Npc;
import com.sg.core.repository.NpcRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }

    @PostConstruct
    private void print() {
        Npc npc1 = new Npc("Thomas", 1, 2);
        Npc npc2 = new Npc("Thomas", 1, 3);
        Npc npc3 = new Npc("Thomas", 1, 4);

        HashMap<Integer, Npc> hashMap = new HashMap<>();

        HashSet<Npc> hashSet = new HashSet<>();

        Hashtable<Integer, Npc> hashTable = new Hashtable<>();

        hashMap.put(1,npc1);
        hashMap.put(2,npc2);
        hashMap.put(3,npc3);

        hashSet.add(npc1);
        hashSet.add(npc2);
        hashSet.add(npc3);

        hashTable.put(1, npc1);
        hashTable.put(2, npc2);
        hashTable.put(3, npc3);

        System.out.println("HashMap:");
        hashMap.forEach((key, value) -> System.out.println(key +", "+value));

        System.out.println("HashSet:");
        hashSet.forEach(System.out::println);

        System.out.println("HashTable:");
        hashTable.forEach((key, value) -> System.out.println(key +", "+value));

    }
}
