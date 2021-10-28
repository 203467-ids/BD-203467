package bd203467.veterinaria.controller;

import bd203467.veterinaria.model.Cliente;
import bd203467.veterinaria.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteController {
    @Autowired
    ClienteRepository clienteRepository;

    @GetMapping(value ="/Cliente")
    public List<Cliente> getCliente(){

        List<Cliente> response = clienteRepository.findAll();

        if (response != null){

            return response;
        }else {
            return  null;
        }

    }

    @PostMapping(value = "/cliente")
    public Cliente getCliente(@RequestBody Cliente cliente){
        return clienteRepository.findByIdCliente(cliente.getIdCliente());
    }
    @PostMapping(value = "/cliente/add",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Cliente addCliente(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }
}
