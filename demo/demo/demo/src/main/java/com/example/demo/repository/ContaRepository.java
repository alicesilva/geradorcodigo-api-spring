package repository;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import model.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long>{

}

