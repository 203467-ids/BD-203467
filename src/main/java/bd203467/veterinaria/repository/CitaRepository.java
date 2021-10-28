package bd203467.veterinaria.repository;

import bd203467.veterinaria.model.Cita;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface CitaRepository extends CrudRepository<Cita, Integer> {
    List<Cita> findAll();
    Cita findByIdCita(int idCita);
    Cita save(Cita cita);

}
