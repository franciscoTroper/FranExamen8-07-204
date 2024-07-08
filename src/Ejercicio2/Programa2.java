package Ejercicio2;

public class Programa2
{
    private double tamañoPagina;
    private double tamañoArchivo;

    public Programa2() {}

    public Programa2(double tamañoPagina, double tamañoArchivo) {
        this.tamañoPagina = tamañoPagina;
        this.tamañoArchivo = tamañoArchivo;
    }

    public void setTamañoPagina(double tamañoPaginaP)
    {
        tamañoPagina= tamañoPaginaP;
    }
    public void setTamañoArchivo(double tamañoArchivoP)
    {
        tamañoArchivo=tamañoArchivoP;
    }
    public int setNumPaginaNecesariasParaUnArchivoDeTamañoDado()
    {
        double paginasNecesarias=tamañoArchivo/tamañoPagina;
        String resultado = String.format("%.0f", paginasNecesarias);
        return Integer.parseInt(resultado);
    }

    public double getTamañoPagina() {
        return tamañoPagina;
    }

    public double getTamañoArchivo() {
        return tamañoArchivo;
    }

    @Override
    public String toString() {
        return "Programa2{" +
                "tamañoPagina=" + tamañoPagina +
                ", tamañoArchivo=" + tamañoArchivo +
                '}';
    }
}
