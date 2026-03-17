package champion_api.championapi.repository;

import champion_api.championapi.model.Champion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChampionRepository extends JpaRepository<Champion, Long> {
}