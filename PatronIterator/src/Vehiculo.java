import java.util.Date;

public class Vehiculo {
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    private String marca;
    private String modelo;
    private Date fechaFabricacion;
    private double precio;

    public Vehiculo(String marca, String modelo, Date fechaFabricacion, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaFabricacion = fechaFabricacion;
        this.precio = precio;
    }

    public String CaracteristicasVehiculo() {
        return marca + " " + modelo + " fabricado en " +
                String.format("%tD", fechaFabricacion) + " con un precio de " +
                precio + " euros.\n";
    }

}
