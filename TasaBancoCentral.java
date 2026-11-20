
public class TasaBancoCentral extends ProveedorTasaCambio {

    @Override
    public double obtenerTasa(String monedaOrigen, String monedaDestino) {

        System.out.println("Consultando tasas del Banco Central...");

        if (monedaOrigen.equals("USD") && monedaDestino.equals("ARS")) {
            return 1000.0;
        }

        if (monedaOrigen.equals("EUR") && monedaDestino.equals("ARS")) {
            return 1100.0;
        }

        if (monedaOrigen.equals("ARS") && monedaDestino.equals("USD")) {
            return 0.001;
        }

        if (monedaOrigen.equals("USD") && monedaDestino.equals("EUR")) {
            return 0.92;
        }

        throw new IllegalArgumentException("Cotizacion no disponible.");
    }
}
