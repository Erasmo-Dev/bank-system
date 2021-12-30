package br.com.backend.banksystem.repository;

import br.com.backend.banksystem.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
