package Principal;

import java.util.List;

public class Compañias {
    private int Numero;
    private String Actividad;
    private List<Soldados> listasoldados;
    private List<Cuartel> listascuarteles;

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public String getActividad() {
        return Actividad;
    }

    public void setActividad(String actividad) {
        Actividad = actividad;
    }

    public List<Soldados> getListasoldados() {
        return listasoldados;
    }

    public void setListasoldados(List<Soldados> listasoldados) {
        this.listasoldados = listasoldados;
    }

    public List<Cuartel> getListascuarteles() {
        return listascuarteles;
    }

    public void setListascuarteles(List<Cuartel> listascuarteles) {
        this.listascuarteles = listascuarteles;
    }
}
