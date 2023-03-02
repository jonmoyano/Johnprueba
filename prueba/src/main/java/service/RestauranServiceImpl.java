package service;

import models.restaurante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import repository.RestauranteRepository;

@Service
public class RestauranServiceImpl extends GenericServiceImpl <restaurante,Long> implements RestauranteService{
    @Autowired
    RestauranteRepository personarepository;
    @Override
    public CrudRepository<restaurante, Long> getDao() {
        return personarepository;
    }
}
