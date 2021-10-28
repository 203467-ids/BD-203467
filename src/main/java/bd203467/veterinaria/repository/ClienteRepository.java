package bd203467.veterinaria.repository;


import bd203467.veterinaria.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends CrudRepository <Cliente, Integer> {
    List<Cliente> findAll();
    Cliente findByIdCliente(int idCliente);
    Cliente save(Cliente cliente);
}
