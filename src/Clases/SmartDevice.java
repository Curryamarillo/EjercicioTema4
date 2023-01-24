package Clases;

public class SmartDevice {
    public String fabricante;
    public String modelo;
    public String sistemaOperativo;
    public int sinceYear;
    public boolean sumergible;
    public boolean usbC;

    public SmartDevice() {
    }

    public SmartDevice(String fabricante, String modelo, String sistemaOperativo, int sinceYear, boolean sumergible, boolean usbC) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.sinceYear = sinceYear;
        this.sumergible = sumergible;
        this.usbC = usbC;
    }
}

