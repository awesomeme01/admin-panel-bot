package tg.bot.admin.panel.data.service;

import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import tg.bot.admin.panel.data.entity.SellingItem;

@Service
public class SellingItemService {

    private final SellingItemRepository repository;

    @Autowired
    public SellingItemService(SellingItemRepository repository) {
        this.repository = repository;
    }

    public Optional<SellingItem> get(UUID id) {
        return repository.findById(id);
    }

    public SellingItem update(SellingItem entity) {
        return repository.save(entity);
    }

    public void delete(UUID id) {
        repository.deleteById(id);
    }

    public Page<SellingItem> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public int count() {
        return (int) repository.count();
    }

}
