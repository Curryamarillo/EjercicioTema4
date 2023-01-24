package Herencias;

import Clases.SmartDevice;

public class SmartWatch extends SmartDevice {
    public boolean sensorLatidos;
    public String materialCorrea;

    public SmartWatch(String fabricante, String modelo, String sistemaOperativo, int sinceYear, boolean sumergible, boolean usbC, boolean sensorLatidos, String materialCorrea){
        super(fabricante, modelo, sistemaOperativo, sinceYear, sumergible, usbC);
        this.sensorLatidos = sensorLatidos;
        this.materialCorrea = materialCorrea;
}
}
