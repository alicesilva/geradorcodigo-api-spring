package repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import model.Telefone;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long>{

}

