package br.com.backend.banksystem.repository;

import br.com.backend.banksystem.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
