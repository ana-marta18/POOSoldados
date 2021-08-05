package Principal;

import java.util.List;

public class Cuartel {
    private int Codigo;
    private String Denominacion;
    private List<Compañias> listacompañia;

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getDenominacion() {
        return Denominacion;
    }

    public void setDenominacion(String denominacion) {
        Denominacion = denominacion;
    }

    public List<Compañias> getListacompañia() {
        return listacompañia;
    }

    public void setListacompañia(List<Compañias> listacompañia) {
        this.listacompañia = listacompañia;
    }
}
