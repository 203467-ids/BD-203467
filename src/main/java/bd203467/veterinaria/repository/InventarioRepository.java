package bd203467.veterinaria.repository;



import bd203467.veterinaria.model.Inventario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventarioRepository extends CrudRepository<Inventario, Integer> {
    List<Inventario> findAll();
    Inventario findByIdProducto(int idProducto);
    Inventario save(Inventario inventario);
}
