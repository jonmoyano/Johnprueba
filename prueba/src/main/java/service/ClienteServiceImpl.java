package service;

import models.cliente;
import org.springframework.data.repository.CrudRepository;
import service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ClienteRepository;

@Service
public class ClienteServiceImpl extends GenericServiceImpl<cliente,Long> implements  ClienteService{
    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public CrudRepository<cliente, Long> getDao() {
        return clienteRepository;
    }
}
