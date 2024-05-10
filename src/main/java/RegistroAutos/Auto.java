package RegistroAutos;

public class Auto {

    private String propietario;
    private String placa;
    private int carnetUniversitario;
    private String colorAuto;
    private String tipoVehiculo;
    private int ocupantes;

    public Auto(String propietario, String placa, int carnetUniversitario, String colorAuto, String tipoVehiculo, int ocupantes) {
        this.propietario = propietario;
        this.placa = placa;
        this.carnetUniversitario = carnetUniversitario;
        this.colorAuto = colorAuto;
        this.tipoVehiculo = tipoVehiculo;
        this.ocupantes = ocupantes;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCarnetUniversitario() {
        return carnetUniversitario;
    }

    public void setCarnetUniversitario(int carnetUniversitario) {
        this.carnetUniversitario = carnetUniversitario;
    }

    public String getColorAuto() {
        return colorAuto;
    }

    public void setColorAuto(String colorAuto) {
        this.colorAuto = colorAuto;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getOcupantes() {
        return ocupantes;
    }

    public void setOcupantes(int ocupantes) {
        this.ocupantes = ocupantes;
    }
    
    

}
