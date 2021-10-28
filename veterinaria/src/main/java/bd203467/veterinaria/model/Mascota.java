package bd203467.veterinaria.model;

import javax.persistence.*;

@Entity
@Table(name="Mascota")
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMascota ;
    @Column (name="idCliente")
    private int idCliente ;
    @Column (name="tipo")
    private String tipo;
    @Column (name="descripcion")
    private String descripcion;
    @Column (name="nombre")
    private String nombre;
    @Column (name="fechaIngreso")
    private String fechaIngreso;
    @Column (name="razonIngreso")
    private String razonIngreso;

    public Mascota(){}

    public Mascota(int idMascota, int idCliente, String tipo, String descripcion, String nombre, String fechaIngreso, String razonIngreso) {
        this.idMascota = idMascota;
        this.idCliente = idCliente;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.razonIngreso = razonIngreso;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getRazonIngreso() {
        return razonIngreso;
    }

    public void setRazonIngreso(String razonIngreso) {
        this.razonIngreso = razonIngreso;
    }
}
