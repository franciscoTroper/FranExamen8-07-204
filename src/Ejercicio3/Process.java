package Ejercicio3;

public class Process
{
    private int id_proceso;
    private String name_proceso;
    private double tiempo_proceso;

    public Process() {}

    public Process(int id_proceso, String name_proceso, double tiempo_proceso) {
        this.id_proceso = id_proceso;
        this.name_proceso = name_proceso;
        this.tiempo_proceso = tiempo_proceso;
    }

    public int getId_proceso() {
        return id_proceso;
    }

    public void setId_proceso(int id_proceso) {
        this.id_proceso = id_proceso;
    }

    public String getName_proceso() {
        return name_proceso;
    }

    public void setName_proceso(String name_proceso) {
        this.name_proceso = name_proceso;
    }

    public double getTiempo_proceso() {
        return tiempo_proceso;
    }

    public void setTiempo_proceso(double tiempo_proceso) {
        this.tiempo_proceso = tiempo_proceso;
    }

    @Override
    public String toString() {
        return "Process{" +
                "id_proceso=" + id_proceso +
                ", name_proceso='" + name_proceso + '\'' +
                ", tiempo_proceso=" + tiempo_proceso +
                '}';
    }
}
