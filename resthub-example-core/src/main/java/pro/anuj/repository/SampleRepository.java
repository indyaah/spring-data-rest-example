package pro.anuj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pro.anuj.model.Sample;

public interface SampleRepository extends JpaRepository<Sample, Long> {

}
