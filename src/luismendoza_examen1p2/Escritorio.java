/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luismendoza_examen1p2;

/**
 *
 * @author luiscarlomendoza
 */
public class Escritorio extends PC{
    private int RAM;
    private int capacidadAlmacenamiento;
    private String tipoAlmacenamiento;
    private boolean tarjetaGrafica;

    public Escritorio() {
        super();
    }

    public Escritorio(int RAM, int capacidadAlmacenamiento, String tipoAlmacenamiento, boolean tarjetaGrafica, String IP, String mascara, String hostName) {
        super(IP, mascara, hostName);
        this.RAM = RAM;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.tipoAlmacenamiento = tipoAlmacenamiento;
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public String getTipoAlmacenamiento() {
        return tipoAlmacenamiento;
    }

    public void setTipoAlmacenamiento(String tipoAlmacenamiento) {
        this.tipoAlmacenamiento = tipoAlmacenamiento;
    }

    public boolean isTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(boolean tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    @Override
    public String toString() {
        return super.toString() + "RAM: " + RAM + "\n"+ "Capacidad de Almacenamiento: "+ capacidadAlmacenamiento + "\n" + "Tipo de Almacenamiento: " + tipoAlmacenamiento + "\n" + "Tarjeta Gráfica: " + tarjetaGrafica + "\n";
    }
    
}
