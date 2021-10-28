package bd203467.veterinaria.controller;

import bd203467.veterinaria.model.Mascota;
import bd203467.veterinaria.repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MascotaController {
    @Autowired
    MascotaRepository mascotaRepository;

    @GetMapping(value ="/ListMascota")
    public List<Mascota> getMascota(){

        List<Mascota> response = mascotaRepository.findAll();

        if (response != null){

            return response;
        }else {
            return  null;
        }

    }

    @PostMapping(value = "/Mascota")
    public Mascota getMascota(@RequestBody Mascota mascota){
        return mascotaRepository.findByIdMascota(mascota.getIdMascota());
    }
    @PostMapping(value = "/Mascota/add",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mascota addMascota(@RequestBody Mascota mascota){
        return mascotaRepository.save(mascota);
    }
}
