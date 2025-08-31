import java.util.Scanner; // Importamos la libreria Scanner para leer datos desde teclado

public class Vehiculo_Distribuidora { // Declaración de la clase principal llamada Distribuidora
    public static void main(String[] args) { // Método principal, punto de inicio del programa
        Scanner sc = new Scanner(System.in); // Crea un objeto Scanner para leer datos desde teclado

        // ==============================
        // 1. Datos del vehiculo
        // ==============================
        String marca, modelo, tipoCombustible;
        int cilindrada, capacidadPasajeros;

        System.out.print("Ingrese la marca del vehiculo: ");
        marca = sc.nextLine();

        System.out.print("Ingrese el modelo del vehiculo: ");
        modelo = sc.nextLine();

        System.out.print("Ingrese la cilindrada del vehiculo (en cc): ");
        cilindrada = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        System.out.print("Ingrese el tipo de combustible: ");
        tipoCombustible = sc.nextLine();

        System.out.print("Ingrese la capacidad en pasajeros: ");
        capacidadPasajeros = sc.nextInt();

        // Mostrar datos ingresados
        System.out.println("\n=== DATOS DEL VEHICULO ===");
        System.out.println("La marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada + " cc");
        System.out.println("El tipo de combustible es: " + tipoCombustible);
        System.out.println("Tiene una capacidad de " + capacidadPasajeros + " pasajeros.");

        // ==============================
        // 2. Caso de estudio - calculo del despacho
        // ==============================
        System.out.print("\nIngrese el total de la compra: ");
        int totalCompra = sc.nextInt();

        System.out.print("Ingrese la distancia en kilometros: ");
        int distancia = sc.nextInt();

        int costoDespacho = 0;

        if (totalCompra >= 50000 && distancia <= 20) {
            costoDespacho = 0; // Despacho gratis
        } else if (totalCompra >= 25000 && totalCompra <= 49999) {
            costoDespacho = distancia * 150;
        } else {
            costoDespacho = distancia * 300;
        }

        // Mostrar resultados del despacho
        System.out.println("\n=== RESULTADO DEL DESPACHO ===");
        System.out.println("Total de la compra: $" + totalCompra);
        System.out.println("Distancia: " + distancia + " km");
        System.out.println("Costo de despacho: $" + costoDespacho);

        sc.close(); // cerrar el Scanner
    }
}

