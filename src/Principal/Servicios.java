package Principal;

import java.util.List;

public class Servicios {
    private int Codigo;
    private String Descripcion;
    private List<Soldados> soldadosList ;

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public List<Soldados> getSoldadosList() {
        return soldadosList;
    }

    public void setSoldadosList(List<Soldados> soldadosList) {
        this.soldadosList = soldadosList;
    }
}
