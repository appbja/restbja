package bja.pnud.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "actividades")
public class Actividades {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nrof;
    private String fecha;
    private String hora;
    private int inscripcionesbja;
    private int inscripcionessuppv;
    private int registrobja;
    private int registrosuppv;
    private int atencion;
    private int capacitacion;
    private int visita;

    public Actividades(String nrof, String fecha, String hora, int inscripcionesbja, int inscripcionessuppv,
            int registrobja, int registrosuppv, int atencion, int capacitacion, int visita) {
        this.nrof = nrof;
        this.fecha = fecha;
        this.hora = hora;
        this.inscripcionesbja = inscripcionesbja;
        this.inscripcionessuppv = inscripcionessuppv;
        this.registrobja = registrobja;
        this.registrosuppv = registrosuppv;
        this.atencion = atencion;
        this.capacitacion = capacitacion;
        this.visita = visita;
    }

    public Actividades() {

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

    public int getInscripcionesbja() {
        return inscripcionesbja;
    }

    public void setInscripcionesbja(int inscripcionesbja) {
        this.inscripcionesbja = inscripcionesbja;
    }

    public int getInscripcionessuppv() {
        return inscripcionessuppv;
    }

    public void setInscripcionessuppv(int inscripcionessuppv) {
        this.inscripcionessuppv = inscripcionessuppv;
    }

    public int getRegistrobja() {
        return registrobja;
    }

    public void setRegistrobja(int registrobja) {
        this.registrobja = registrobja;
    }

    public int getRegistrosuppv() {
        return registrosuppv;
    }

    public void setRegistrosuppv(int registrosuppv) {
        this.registrosuppv = registrosuppv;
    }

    public int getAtencion() {
        return atencion;
    }

    public void setAtencion(int atencion) {
        this.atencion = atencion;
    }

    public int getCapacitacion() {
        return capacitacion;
    }

    public void setCapacitacion(int capacitacion) {
        this.capacitacion = capacitacion;
    }

    public int getVisita() {
        return visita;
    }

    public void setVisita(int visita) {
        this.visita = visita;
    }

}
