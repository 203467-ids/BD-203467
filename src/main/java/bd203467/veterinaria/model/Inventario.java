package bd203467.veterinaria.model;

import javax.persistence.*;

@Entity
@Table(name="Inventario")
public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int idProducto ;
    @Column (name="nombre")
   private String nombre;
    @Column (name="sustanciaActiva")
   private String sustanciaActiva;
    @Column (name="fechaCaducidad")
   private String fechaCaducidad;

    public Inventario(){}

    public Inventario(int idProducto, String nombre, String sustanciaActiva, String fechaCaducidad) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.sustanciaActiva = sustanciaActiva;
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSustanciaActiva() {
        return sustanciaActiva;
    }

    public void setSustanciaActiva(String sustanciaActiva) {
        this.sustanciaActiva = sustanciaActiva;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
}
