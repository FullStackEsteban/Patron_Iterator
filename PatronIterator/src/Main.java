public class Main {
    public static void main(String[] args) {
        // Declaramos el registro
        IRegistroVehiculos registro = new RegistroVehiculos();

        // Insertamos unos cuantos elementos
        registro.InsertarVehiculo("Volkswagen", "Polo", 12300);
        registro.InsertarVehiculo("Volkswagen", "Golf GTI", 18900);
        registro.InsertarVehiculo("Volkswagen", "Passat", 27000);
        registro.InsertarVehiculo("Volkswagen", "Scirocco", 32100);
        registro.InsertarVehiculo("Volkswagen", "Touareg", 21800);

        // Obtenemos el iterador
        IIteratorVehiculo iterador = registro.ObtenerIterator();

        // Mientras queden elementos
        while (iterador.QuedanElementos()) {
            // Obtenemos el siguiente elemento
            Vehiculo v = iterador.Siguiente();

            // Mostramos su contenido
            System.out.println(v.getMarca() + " " + v.getModelo() + " fabricado el " + v.getFechaFabricacion() + " (" + v.getPrecio() + " euros)");
        }
    }
}
