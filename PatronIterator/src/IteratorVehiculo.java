import java.util.ArrayList;

public class IteratorVehiculo implements IIteratorVehiculo {
    // Referencia al listado completo
    private ArrayList<Vehiculo> vehiculos;

    // Almacenaremos el índice en el que se encuentra el iterador
    private int posicionActual = -1;

    // Constructor que inyectará el ArrayList en el objeto
    public IteratorVehiculo(ArrayList<Vehiculo> listado) {
        this.vehiculos = listado;
    }

    // Operación 1: Reinicio del índice, colocándolo en el elemento anterior al primero
    public void Primero() {
        this.posicionActual = -1;
    }

    // Operación 2: Acceso al elemento actual
    public Vehiculo Actual() {
        if (this.vehiculos == null || this.vehiculos.isEmpty() || posicionActual > this.vehiculos.size() - 1 || posicionActual < 0) {
            return null;
        } else {
            return this.vehiculos.get(posicionActual);
        }
    }

    // Operación 3: Acceso al siguiente elemento
    public Vehiculo Siguiente() {
        if (this.vehiculos == null || this.vehiculos.isEmpty() || posicionActual + 1 > this.vehiculos.size() - 1) {
            return null;
        } else {
            return this.vehiculos.get(++posicionActual);
        }
    }

    // Operación 4: Comprobación de si existen elementos en la colección
    public boolean QuedanElementos() {
        return (posicionActual + 1 <= this.vehiculos.size() - 1);
    }
}
