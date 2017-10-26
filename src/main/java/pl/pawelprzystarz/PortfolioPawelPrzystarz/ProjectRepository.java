package pl.pawelprzystarz.PortfolioPawelPrzystarz;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.pawelprzystarz.PortfolioPawelPrzystarz.models.Project;

import java.util.List;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Integer> {
    List<Project> findAll();
}
