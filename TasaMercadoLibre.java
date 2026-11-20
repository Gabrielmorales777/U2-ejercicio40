
public class TasaMercadoLibre extends ProveedorTasaCambio {

    @Override
    public double obtenerTasa(String monedaOrigen, String monedaDestino) {

        System.out.println("Consultando tasas del mercado de divisas...");

        if (monedaOrigen.equals("USD") && monedaDestino.equals("ARS")) {
            return 1150.0;
        }

        if (monedaOrigen.equals("EUR") && monedaDestino.equals("ARS")) {
            return 1250.0;
        }

        if (monedaOrigen.equals("ARS") && monedaDestino.equals("USD")) {
            return 1.0 / 1150.0;
        }

        if (monedaOrigen.equals("USD") && monedaDestino.equals("EUR")) {
            return 0.95;
        }

        throw new IllegalArgumentException("Cotizacion no disponible.");
    }
}
