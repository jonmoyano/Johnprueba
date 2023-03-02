package repository;

import models.carta;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartaRepository extends MongoRepository <carta,Long> {
}
