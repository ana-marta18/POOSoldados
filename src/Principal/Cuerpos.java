package Principal;

import java.util.List;

public class Cuerpos extends Datos {
    private int Codigo;
    private String Ubicacion;
    private List<Soldados> listasoldados;

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
    }

    public List<Soldados> getListasoldados() {
        return listasoldados;
    }

    public void setListasoldados(List<Soldados> listasoldados) {
        this.listasoldados = listasoldados;
    }
}
