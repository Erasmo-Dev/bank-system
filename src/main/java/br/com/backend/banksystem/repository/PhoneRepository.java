package br.com.backend.banksystem.repository;

import br.com.backend.banksystem.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, Long> {
}
