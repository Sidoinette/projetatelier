package com.ism.ecom.data.repositories;

import com.ism.ecom.data.entities.Client;
import com.ism.ecom.data.entities.Course;
import com.ism.ecom.data.entities.Trajet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findAllByActiveTrue();
    Page<Course> findAllByActiveTrue(Pageable pageable);

//    Page<Trajet>   findAllByTelephoneContainsAndActiveTrue(String telephone,Pageable pageable);

    List<Course> findAllByClient(Client client);
}
