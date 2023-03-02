package controller;


import models.cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.ClienteService;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    ClienteService clienteservice;
    @GetMapping("/listar")
    public ResponseEntity<List<cliente>> listarCliente(){
        return new ResponseEntity<>(clienteservice.findByAll(), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<cliente> crear(@RequestBody cliente
                                                 c){
        return new ResponseEntity<>(clienteservice.save(c),HttpStatus.CREATED);
    }

    @PutMapping("/up/{id}")
    public ResponseEntity<cliente> act(@PathVariable Long id,@RequestBody cliente c){
        cliente cli =clienteservice.findById(id);
        if (clienteservice==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            try{
                cli.setNombre(c.getNombre());
                cli.setCorreo(c.getCorreo());
                return new ResponseEntity<>(clienteservice.save(cli),HttpStatus.OK);
            }catch (DataAccessException e){
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
    @DeleteMapping("/el/{id}")
    public ResponseEntity<cliente> elidminar(@PathVariable Long id){
        clienteservice.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}