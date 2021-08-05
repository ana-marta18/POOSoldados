package Principal;

import java.util.List;
public class Soldados extends Datos {

    private int Codigo;
    private String Graduacion;
    private Compañias compañia;
    private Cuerpos cuerpo;
    private List<Compañias> listacompañia;
    private List<Servicios> servicios;

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getGraduacion() {
        return Graduacion;
    }

    public void setGraduacion(String graduacion) {
        Graduacion = graduacion;
    }

    public Compañias getCompañia() {
        return compañia;
    }

    public void setCompañia(Compañias compañia) {
        this.compañia = compañia;
    }

    public Cuerpos getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(Cuerpos cuerpo) {
        this.cuerpo = cuerpo;
    }

    public List<Compañias> getListacompañia() {
        return listacompañia;
    }

    public void setListacompañia(List<Compañias> listacompañia) {
        this.listacompañia = listacompañia;
    }

    public List<Servicios> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicios> servicios) {
        this.servicios = servicios;
    }
}
