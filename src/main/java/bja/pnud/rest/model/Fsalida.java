package bja.pnud.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fsalida")
public class Fsalida {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nrof;
    private String codigom;
    private String nombrem;
    private String fecha;
    private String hora;
    private String rotacion;
    private String tipoarea;
    private String departamento;
    private String provincia;
    private String redsalud;
    private String municipio;
    private String centrosalud;
    private String localidad;
    private String tipocamino;
    private String tipotransporte;
    private String desctransporte;
    private String recpropios;
    private String eess;
    private String gam;
    private String gaioc;
    private String otrotp;
    private String descpago;
    private String gasolina;
    private String pasajes;
    private String ponton;
    private String otrosgastos;
    private int costogasolina;
    private int costopasajes;
    private int costoponton;
    private int costootros;

    public Fsalida() {

    }

    public Fsalida(String nrof, String codigom, String nombrem, String fecha, String hora, String rotacion,
            String tipoarea, String departamento, String provincia, String redsalud, String municipio,
            String centrosalud, String localidad, String tipocamino, String tipotransporte, String desctransporte,
            String recpropios, String eess, String gam, String gaioc, String otrotp, String descpago, String gasolina,
            String pasajes, String ponton, String otrosgastos, int costogasolina, int costopasajes, int costoponton,
            int costootros) {
        this.nrof = nrof;
        this.codigom = codigom;
        this.nombrem = nombrem;
        this.fecha = fecha;
        this.hora = hora;
        this.rotacion = rotacion;
        this.tipoarea = tipoarea;
        this.departamento = departamento;
        this.provincia = provincia;
        this.redsalud = redsalud;
        this.municipio = municipio;
        this.centrosalud = centrosalud;
        this.localidad = localidad;
        this.tipocamino = tipocamino;
        this.tipotransporte = tipotransporte;
        this.desctransporte = desctransporte;
        this.recpropios = recpropios;
        this.eess = eess;
        this.gam = gam;
        this.gaioc = gaioc;
        this.otrotp = otrotp;
        this.descpago = descpago;
        this.gasolina = gasolina;
        this.pasajes = pasajes;
        this.ponton = ponton;
        this.otrosgastos = otrosgastos;
        this.costogasolina = costogasolina;
        this.costopasajes = costopasajes;
        this.costoponton = costoponton;
        this.costootros = costootros;
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

    public String getCodigom() {
        return codigom;
    }

    public void setCodigom(String codigom) {
        this.codigom = codigom;
    }

    public String getNombrem() {
        return nombrem;
    }

    public void setNombrem(String nombrem) {
        this.nombrem = nombrem;
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

    public String getRotacion() {
        return rotacion;
    }

    public void setRotacion(String rotacion) {
        this.rotacion = rotacion;
    }

    public String getTipoarea() {
        return tipoarea;
    }

    public void setTipoarea(String tipoarea) {
        this.tipoarea = tipoarea;
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

    public String getTipocamino() {
        return tipocamino;
    }

    public void setTipocamino(String tipocamino) {
        this.tipocamino = tipocamino;
    }

    public String getTipotransporte() {
        return tipotransporte;
    }

    public void setTipotransporte(String tipotransporte) {
        this.tipotransporte = tipotransporte;
    }

    public String getDesctransporte() {
        return desctransporte;
    }

    public void setDesctransporte(String desctransporte) {
        this.desctransporte = desctransporte;
    }

    public String getRecpropios() {
        return recpropios;
    }

    public void setRecpropios(String recpropios) {
        this.recpropios = recpropios;
    }

    public String getEess() {
        return eess;
    }

    public void setEess(String eess) {
        this.eess = eess;
    }

    public String getGam() {
        return gam;
    }

    public void setGam(String gam) {
        this.gam = gam;
    }

    public String getGaioc() {
        return gaioc;
    }

    public void setGaioc(String gaioc) {
        this.gaioc = gaioc;
    }

    public String getOtrotp() {
        return otrotp;
    }

    public void setOtrotp(String otrotp) {
        this.otrotp = otrotp;
    }

    public String getDescpago() {
        return descpago;
    }

    public void setDescpago(String descpago) {
        this.descpago = descpago;
    }

    public String getGasolina() {
        return gasolina;
    }

    public void setGasolina(String gasolina) {
        this.gasolina = gasolina;
    }

    public String getPasajes() {
        return pasajes;
    }

    public void setPasajes(String pasajes) {
        this.pasajes = pasajes;
    }

    public String getPonton() {
        return ponton;
    }

    public void setPonton(String ponton) {
        this.ponton = ponton;
    }

    public String getOtrosgastos() {
        return otrosgastos;
    }

    public void setOtrosgastos(String otrosgastos) {
        this.otrosgastos = otrosgastos;
    }

    public int getCostogasolina() {
        return costogasolina;
    }

    public void setCostogasolina(int costogasolina) {
        this.costogasolina = costogasolina;
    }

    public int getCostopasajes() {
        return costopasajes;
    }

    public void setCostopasajes(int costopasajes) {
        this.costopasajes = costopasajes;
    }

    public int getCostoponton() {
        return costoponton;
    }

    public void setCostoponton(int costoponton) {
        this.costoponton = costoponton;
    }

    public int getCostootros() {
        return costootros;
    }

    public void setCostootros(int costootros) {
        this.costootros = costootros;
    }

}
