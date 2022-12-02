package tg.bot.admin.panel.data.service;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import tg.bot.admin.panel.data.entity.MessageKeyboard;

public interface MessageKeyboardRepository extends JpaRepository<MessageKeyboard, UUID> {

}