import java.util.Scanner;

public class Ventas {
    static int[][] ventas = new int[12][3];
    static String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio",
                             "Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    static String[] departamentos = {"Ropa","Deportes","Juguetería"};

    public static int buscarIndice(String[] arreglo, String valor) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].equalsIgnoreCase(valor)) {
                return i;
            }
        }
        return -1; // No encontrado
    }

    public static void insertarVenta(String mes, String depto, int valor) {
        int i = buscarIndice(meses, mes);
        int j = buscarIndice(departamentos, depto);
        if (i != -1 && j != -1) {
            ventas[i][j] = valor;
        } else {
            System.out.println("Mes o departamento inválido.");
        }
    }

    public static int buscarVenta(String mes, String depto) {
        int i = buscarIndice(meses, mes);
        int j = buscarIndice(departamentos, depto);
        return (i != -1 && j != -1) ? ventas[i][j] : -1;
    }

    public static void eliminarVenta(String mes, String depto) {
        int i = buscarIndice(meses, mes);
        int j = buscarIndice(departamentos, depto);
        if (i != -1 && j != -1) {
            ventas[i][j] = 0;
        } else {
            System.out.println("Mes o departamento inválido.");
        }
    }

    public static void mostrarTabla() {
        System.out.printf("%-12s", "Mes");
        for (String depto : departamentos) {
            System.out.printf("%-12s", depto);
        }
        System.out.println();
        System.out.println("-----------------------------------------");
        for (int i = 0; i < 12; i++) {
            System.out.printf("%-12s", meses[i]);
            for (int j = 0; j < 3; j++) {
                System.out.printf("%-12d", ventas[i][j]);
            }
            System.out.println();
        }
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Menú de Ventas ---");
            System.out.println("1. Insertar venta");
            System.out.println("2. Buscar venta");
            System.out.println("3. Eliminar venta");
            System.out.println("4. Mostrar tabla de ventas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Ingrese el mes: ");
                    String mesInsert = sc.nextLine();
                    System.out.print("Ingrese el departamento: ");
                    String deptoInsert = sc.nextLine();
                    System.out.print("Ingrese el valor de la venta: ");
                    int valor = Integer.parseInt(sc.nextLine());
                    insertarVenta(mesInsert, deptoInsert, valor);
                    break;
                case "2":
                    System.out.print("Ingrese el mes: ");
                    String mesBuscar = sc.nextLine();
                    System.out.print("Ingrese el departamento: ");
                    String deptoBuscar = sc.nextLine();
                    int venta = buscarVenta(mesBuscar, deptoBuscar);
                    if (venta != -1) {
                        System.out.println("Venta en " + mesBuscar + "-" + deptoBuscar + ": " + venta);
                    } else {
                        System.out.println("Mes o departamento inválido.");
                    }
                    break;
                case "3":
                    System.out.print("Ingrese el mes: ");
                    String mesEliminar = sc.nextLine();
                    System.out.print("Ingrese el departamento: ");
                    String deptoEliminar = sc.nextLine();
                    eliminarVenta(mesEliminar, deptoEliminar);
                    break;
                case "4":
                    mostrarTabla();
                    break;
                case "5":
                    System.out.println("Saliendo del programa...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}

