/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luismendoza_examen1p2;

/**
 *
 * @author luiscarlomendoza
 */
public class PC {
    
    protected String IP;
    protected String mascara;
    protected String hostName;

    public PC() {
    }

    public PC(String IP, String mascara, String hostName) {
        this.IP = IP;
        this.mascara = mascara;
        this.hostName = hostName;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    @Override
    public String toString() {
        return "IP: " + IP + "\n" + "mascara: " + mascara + "\n" + "Host Name: " + hostName + "\n";
    }
    
    
    
    
}
