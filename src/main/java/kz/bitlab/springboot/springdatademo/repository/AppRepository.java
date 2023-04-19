package kz.bitlab.springboot.springdatademo.repository;

import jakarta.transaction.Transactional;
import kz.bitlab.springboot.springdatademo.model.ApplicationRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface AppRepository extends JpaRepository<ApplicationRequest, Long> {
}
