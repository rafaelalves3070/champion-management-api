package champion_api.championapi.controller;
import jakarta.validation.Valid;
import champion_api.championapi.model.Champion;
import champion_api.championapi.service.ChampionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/champions")
public class ChampionController {

    private final ChampionService service;

    public ChampionController(ChampionService service) {
        this.service = service;
    }

    @PostMapping
    public Champion create(@RequestBody @Valid Champion champion) {
        return service.create(champion);
    }

    @GetMapping
    public List<Champion> findAll() {
        return service.findAll();
    }
    @GetMapping("/{id}")
    public Champion findById(@PathVariable Long id) {
        return service.findById(id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}