package bd203467.veterinaria.repository;

import bd203467.veterinaria.model.Inventario;
import bd203467.veterinaria.model.Mascota;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MascotaRepository extends CrudRepository<Mascota, Integer> {
    List<Mascota> findAll();
    Mascota findByIdMascota(int idMascota);
    Mascota save(Mascota mascota);

}
