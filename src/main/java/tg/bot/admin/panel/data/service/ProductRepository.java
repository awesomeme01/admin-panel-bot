package tg.bot.admin.panel.data.service;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import tg.bot.admin.panel.data.entity.Product;

public interface ProductRepository extends JpaRepository<Product, UUID> {

}