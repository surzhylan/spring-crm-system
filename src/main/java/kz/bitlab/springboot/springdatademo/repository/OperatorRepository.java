package kz.bitlab.springboot.springdatademo.repository;

import jakarta.transaction.Transactional;
import kz.bitlab.springboot.springdatademo.model.Operators;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface OperatorRepository extends JpaRepository<Operators, Long> {
}
