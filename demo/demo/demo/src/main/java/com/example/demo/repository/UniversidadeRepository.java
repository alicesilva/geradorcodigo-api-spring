package repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import model.Universidade;

@Repository
public interface UniversidadeRepository extends JpaRepository<Universidade, Long>{

}

