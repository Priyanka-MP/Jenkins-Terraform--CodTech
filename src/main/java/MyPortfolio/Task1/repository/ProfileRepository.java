package MyPortfolio.Task1.repository;

import MyPortfolio.Task1.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
