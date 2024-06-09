package com.ism.ecom.data.fixtures;


import com.ism.ecom.data.entities.*;
import com.ism.ecom.data.repositories.*;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
@RequiredArgsConstructor
@Order(5)
public class CourseFixtures  implements CommandLineRunner {
    private final ItineraireRepository itineraireRepository;
    private final CourseRepository courseRepository;
    private final ClientRepository clientRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Course> courseList=new ArrayList<Course>();
        for (int i = 0; i <= 5; i++) {
            Client client = clientRepository.findById(Long.valueOf(i)).orElse(null);
            if (client!=null){
                for (int j = 0; j < 5; j++) {
                    Itineraire itineraire = itineraireRepository.findById(Long.valueOf(j)).orElse(null);
                    if (itineraire!=null){
                        Random random = new Random();
                        int randomNumber = random.nextInt(100) + j;
                        Course course = new Course();
                        course.setClient(client);
                        course.setItineraire(itineraire);
                        course.setActive(j%2==0);
                        courseList.add(course);
                    }
                }
            }
        }
        courseRepository.saveAllAndFlush(courseList);
    }
}
