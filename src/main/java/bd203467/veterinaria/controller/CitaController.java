package bd203467.veterinaria.controller;

import bd203467.veterinaria.model.Cita;
import bd203467.veterinaria.repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CitaController {

    @Autowired
    CitaRepository citaRepository;

    @GetMapping(value ="/Cita")
    public List<Cita> getCita(){

        List<Cita> response = citaRepository.findAll();

        if (response != null){

            return response;
        }else {
            return  null;
        }

    }

    @PostMapping(value = "/cita")
    public Cita getCita(@RequestBody Cita cita){
        return citaRepository.findByIdCita(cita.getIdCita());
    }
    @PostMapping(value = "/cita/add",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Cita addCita(@RequestBody Cita cita){
        return citaRepository.save(cita);
    }
}

