package bd203467.veterinaria.controller;

import bd203467.veterinaria.model.Inventario;
import bd203467.veterinaria.repository.CitaRepository;
import bd203467.veterinaria.repository.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class InventarioController {
    @Autowired
    InventarioRepository inventarioRepository;

    @GetMapping(value ="/ListInventario")
    public List<Inventario> geInventario(){

        List<Inventario> response = inventarioRepository.findAll();

        if (response != null){

            return response;
        }else {
            return  null;
        }

    }

    @PostMapping(value = "/inventario")
    public Inventario getInventario(@RequestBody Inventario inventario){
        return inventarioRepository.findByIdProducto(inventario.getIdProducto());
    }
    @PostMapping(value = "/inventario/add",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Inventario addInventario(@RequestBody Inventario inventario){
        return inventarioRepository.save(inventario);
    }
}

