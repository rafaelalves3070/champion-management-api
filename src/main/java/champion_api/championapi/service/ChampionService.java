package champion_api.championapi.service;

import champion_api.championapi.model.Champion;
import champion_api.championapi.repository.ChampionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChampionService {

    private final ChampionRepository repository;

    public ChampionService(ChampionRepository repository) {
        this.repository = repository;
    }

    public Champion create(Champion champion) {
        return repository.save(champion);
    }

    public List<Champion> findAll() {
        return repository.findAll();
    }

    public Champion findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Champion not found"));
    }
    public void delete(Long id) {
        repository.deleteById(id);
    }
}