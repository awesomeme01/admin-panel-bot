package tg.bot.admin.panel.data.service;

import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import tg.bot.admin.panel.data.entity.PrincipalRole;

@Service
public class PrincipalRoleService {

    private final PrincipalRoleRepository repository;

    @Autowired
    public PrincipalRoleService(PrincipalRoleRepository repository) {
        this.repository = repository;
    }

    public Optional<PrincipalRole> get(UUID id) {
        return repository.findById(id);
    }

    public PrincipalRole update(PrincipalRole entity) {
        return repository.save(entity);
    }

    public void delete(UUID id) {
        repository.deleteById(id);
    }

    public Page<PrincipalRole> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public int count() {
        return (int) repository.count();
    }

}
