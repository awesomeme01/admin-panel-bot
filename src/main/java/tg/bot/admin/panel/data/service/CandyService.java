package tg.bot.admin.panel.data.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import tg.bot.core.domain.Candy;
import tg.bot.core.repository.CandyRepository;

@Service
public class CandyService {

    private final CandyRepository repository;

    @Autowired
    public CandyService(CandyRepository repository) {
        this.repository = repository;
    }

    public Optional<Candy> get(Long id) {
        return repository.findById(id);
    }

    public Candy update(Candy entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Page<Candy> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public int count() {
        return (int) repository.count();
    }

}
