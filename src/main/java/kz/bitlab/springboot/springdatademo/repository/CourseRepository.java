package kz.bitlab.springboot.springdatademo.repository;

import jakarta.transaction.Transactional;
import kz.bitlab.springboot.springdatademo.model.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface CourseRepository extends JpaRepository<Courses, Long> {
}
