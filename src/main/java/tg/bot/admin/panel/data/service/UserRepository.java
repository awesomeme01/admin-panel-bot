package tg.bot.admin.panel.data.service;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import tg.bot.admin.panel.data.entity.User;

public interface UserRepository extends JpaRepository<User, UUID> {

    User findByUsername(String username);
}