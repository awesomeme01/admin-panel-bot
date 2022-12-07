package tg.bot.admin.panel.data.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tg.bot.admin.panel.data.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}