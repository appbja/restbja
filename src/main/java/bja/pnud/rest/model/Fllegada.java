package bja.pnud.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fllegada")
public class Fllegada {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nrof;
    private String fecha;
    private String hora;
    private String departamento;
    private String provincia;
    private String redsalud;
    private String municipio;
    private String centrosalud;
    private String localidad;
    private String tipo;

    public Fllegada(String nrof, String fecha, String hora, String departamento, String provincia, String redsalud,
            String municipio, String centrosalud, String localidad, String tipo) {
        this.nrof = nrof;
        this.fecha = fecha;
        this.hora = hora;
        this.departamento = departamento;
        this.provincia = provincia;
        this.redsalud = redsalud;
        this.municipio = municipio;
        this.centrosalud = centrosalud;
        this.localidad = localidad;
        this.tipo = tipo;
    }

    public Fllegada() {

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

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getRedsalud() {
        return redsalud;
    }

    public void setRedsalud(String redsalud) {
        this.redsalud = redsalud;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCentrosalud() {
        return centrosalud;
    }

    public void setCentrosalud(String centrosalud) {
        this.centrosalud = centrosalud;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
