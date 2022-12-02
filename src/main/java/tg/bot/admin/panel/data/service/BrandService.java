package tg.bot.admin.panel.data.service;

import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import tg.bot.admin.panel.data.entity.Brand;

@Service
public class BrandService {

    private final BrandRepository repository;

    @Autowired
    public BrandService(BrandRepository repository) {
        this.repository = repository;
    }

    public Optional<Brand> get(UUID id) {
        return repository.findById(id);
    }

    public Brand update(Brand entity) {
        return repository.save(entity);
    }

    public void delete(UUID id) {
        repository.deleteById(id);
    }

    public Page<Brand> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public int count() {
        return (int) repository.count();
    }

}
