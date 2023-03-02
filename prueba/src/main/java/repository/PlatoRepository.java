package repository;

import models.plato;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlatoRepository extends MongoRepository<plato,Long> {
}
