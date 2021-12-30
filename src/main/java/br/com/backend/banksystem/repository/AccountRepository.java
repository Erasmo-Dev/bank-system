package br.com.backend.banksystem.repository;

import br.com.backend.banksystem.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
