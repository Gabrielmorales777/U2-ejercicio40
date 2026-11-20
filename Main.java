
public class Main {

    public static void main(String[] args) {

        ProveedorTasaCambio banco = new TasaBancoCentral();

        ProveedorTasaCambio mercado = new TasaMercadoLibre();

        ConversorMoneda conversor = new ConversorMoneda(banco);

        double monto = 100;

        System.out.println("=== SISTEMA DE CONVERSION DE DIVISAS ===");

        System.out.println("\n--- BANCO CENTRAL ---");

        double resultadoBanco = conversor.convertir(
                monto, "USD", "ARS"
        );

        System.out.println(
                monto + " USD equivalen a " + resultadoBanco + " ARS"
        );

        conversor.cambiarProveedor(mercado);

        System.out.println("\n--- MERCADO DE DIVISAS ---");

        double resultadoMercado = conversor.convertir(
                monto, "USD", "ARS"
        );

        System.out.println(
                monto + " USD equivalen a " + resultadoMercado + " ARS"
        );
    }
}
