package bja.pnud.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "coordenadas")
public class Coordenadas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nrof;
    private String latitud;
    private String longitud;
    private String fecha;
    private String hora;

    public Coordenadas() {

    }

    public Coordenadas(String nrof, String latitud, String longitud, String fecha, String hora) {
        this.nrof = nrof;
        this.latitud = latitud;
        this.longitud = longitud;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNrof() {
        return nrof;
    }

    public void setNrof(String nrof) {
        this.nrof = nrof;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
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

}
