package co.com.carlos.quintero.pruebatecnica.repository;

import co.com.carlos.quintero.pruebatecnica.model.numberArrayRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface numberArrayRepository extends JpaRepository<numberArrayRecord, Long> {

}
