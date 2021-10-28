package bd203467.veterinaria.model;

import javax.persistence.*;

@Entity
@Table (name="cita")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCita;
    @Column (name="idCliente")
    private Integer idCliente;
    @Column (name="idMascota")
    private Integer idMascota;
    @Column (name="fecha")
    private String fecha;
    @Column (name="hora")
    private String hora;
    @Column (name="tipoServicio")
    private String tipoServicio;


    public Cita(){}

    public Cita(Integer idCita, Integer idCliente, Integer idMascota, String fecha, String hora, String tipoServicio) {
        this.idCita = idCita;
        this.idCliente = idCliente;
        this.idMascota = idMascota;
        this.fecha = fecha;
        this.hora = hora;
        this.tipoServicio = tipoServicio;
    }

    public Integer getIdCita() {
        return idCita;
    }

    public void setIdCita(Integer idCita) {
        this.idCita = idCita;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(Integer idMascota) {
        this.idMascota = idMascota;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
}
