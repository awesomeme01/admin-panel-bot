package tg.bot.admin.panel.data.service;

import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import tg.bot.admin.panel.data.entity.Booking;

@Service
public class BookingService {

    private final BookingRepository repository;

    @Autowired
    public BookingService(BookingRepository repository) {
        this.repository = repository;
    }

    public Optional<Booking> get(UUID id) {
        return repository.findById(id);
    }

    public Booking update(Booking entity) {
        return repository.save(entity);
    }

    public void delete(UUID id) {
        repository.deleteById(id);
    }

    public Page<Booking> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public int count() {
        return (int) repository.count();
    }

}
