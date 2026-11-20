
public class ConversorMoneda {

    private ProveedorTasaCambio proveedor;

    public ConversorMoneda(ProveedorTasaCambio proveedor) {
        this.proveedor = proveedor;
    }

    public double convertir(
            double monto,
            String monedaOrigen,
            String monedaDestino
    ) {

        if (monto <= 0) {
            throw new IllegalArgumentException(
                    "El monto debe ser mayor a cero."
            );
        }

        double tasa = proveedor.obtenerTasa(
                monedaOrigen,
                monedaDestino
        );

        double resultado = monto * tasa;

        return resultado;
    }

    public void cambiarProveedor(ProveedorTasaCambio proveedor) {
        this.proveedor = proveedor;
    }
}
