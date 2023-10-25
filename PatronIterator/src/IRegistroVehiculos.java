public interface IRegistroVehiculos {
    void InsertarVehiculo(String marca, String modelo, double precio);
    Vehiculo MostrarInformacionVehiculo(int indice);
    IIteratorVehiculo ObtenerIterator();
}
