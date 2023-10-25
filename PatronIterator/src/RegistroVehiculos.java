import java.util.ArrayList;
import java.util.Date;

public class RegistroVehiculos implements IRegistroVehiculos {
    private ArrayList<Vehiculo> listaVehiculos;

    public RegistroVehiculos() {
        this.listaVehiculos = new ArrayList<>();
    }

    @Override
    public void InsertarVehiculo(String marca, String modelo, double precio) {
        Vehiculo v = new Vehiculo(marca, modelo, new Date(), precio);
        listaVehiculos.add(v);
    }

    @Override
    public Vehiculo MostrarInformacionVehiculo(int indice) {
        return listaVehiculos.get(indice);
    }

    public IIteratorVehiculo ObtenerIterator()
    {
        return new IteratorVehiculo(listaVehiculos);
    }
}
