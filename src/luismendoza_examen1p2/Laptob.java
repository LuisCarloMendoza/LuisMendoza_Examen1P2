/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luismendoza_examen1p2;

/**
 *
 * @author luiscarlomendoza
 */
public class Laptob extends PC {
    
    private String marca;
    private String resolucionP;
    private boolean RGB;

    public Laptob() {
        super();
    }

    public Laptob(String marca, String resolucionP, boolean RGB, String IP, String mascara, String hostName) {
        super(IP, mascara, hostName);
        this.marca = marca;
        this.resolucionP = resolucionP;
        this.RGB = RGB;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getResolucionP() {
        return resolucionP;
    }

    public void setResolucionP(String resolucionP) {
        this.resolucionP = resolucionP;
    }

    public boolean isRGB() {
        return RGB;
    }

    public void setRGB(boolean RGB) {
        this.RGB = RGB;
    }

    @Override
    public String toString() {
        return super.toString() + "marca: " + marca + "\n" + "Resolución de Pantalla: "+resolucionP + "\n" + "RBG: " + RGB + "\n";
    }
    
    
    
}
