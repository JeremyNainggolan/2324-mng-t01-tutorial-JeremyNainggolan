package model;

public class TypeC implements Charger {
    private String merk;
    private int voltage;
    private int chargingSpeed;

    public TypeC(String _merk, int _voltage, int _chargingSpeed) {
        this.merk = _merk;
        this.voltage = _voltage;
        this.chargingSpeed = _chargingSpeed;
    }

    public String getMerk() {
        return this.merk;
    }

    public int getVoltage() {
        return this.voltage;
    }

    public int getChargingSpeed() {
        return this.chargingSpeed;
    }

    @Override
    public String toString() {
        return "Type C [ merk = " + getMerk() + ", voltage = " + getVoltage() + "V" + ", chargingSpeed = " + getChargingSpeed() + "W" + " ]";
    }
}
