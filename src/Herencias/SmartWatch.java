package Herencias;

import Clases.SmartDevice;

public class SmartWatch extends SmartDevice {
    public boolean sensorLatidos;
    public String materialCorrea;
public SmartWatch(boolean sensorLatidos, String materialCorrea){
    super();
    this.sensorLatidos = sensorLatidos;
        this.materialCorrea = materialCorrea;
}
}
