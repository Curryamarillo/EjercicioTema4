package Herencias;

import Clases.SmartDevice;

public class SmartPhone extends SmartDevice {
     public boolean funda;
     public String tecPantalla;


    public SmartPhone(String fabricante, String modelo, String sistemaOperativo, int sinceYear, boolean sumergible, boolean usbC, boolean funda, String tecPantalla) {
        super(fabricante, modelo, sistemaOperativo, sinceYear, sumergible, usbC);
        this.funda = funda;
        this.tecPantalla = tecPantalla;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "funda=" + funda +
                ", tecPantalla='" + tecPantalla + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", sinceYear=" + sinceYear +
                ", sumergible=" + sumergible +
                ", usbC=" + usbC +
                '}';
    }
}


