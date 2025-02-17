import java.util.HashMap;
import java.util.Map;

public class EjemploCollection {
    public static void main(String[] args) {

        Map<String, Integer> dispositivos = new HashMap<>();


        dispositivos.put("Teléfono", 5);
        dispositivos.put("Computadora", 8);
        dispositivos.put("Monitor", 3);
        dispositivos.put("Teclado", 12);
        dispositivos.put("Mouse", 6);
        dispositivos.put("Impresora", 4);
        dispositivos.put("Tablet", 2);
        dispositivos.put("Consola", 10);
        dispositivos.put("Smartwatch", 1);
        dispositivos.put("Router", 3);
        dispositivos.put("Cámara", 7);

        // Mostrar los dispositivos con sus cantidades
        System.out.println("Dispositivos en la colección con cantidades: " + dispositivos);


        System.out.println("Número total de tipos de dispositivos en la colección: " + dispositivos.size());


        dispositivos.remove("Computadora");
        System.out.println("Después de eliminar Computadora: " + dispositivos);


        if (dispositivos.containsKey("Teléfono")) {
            System.out.println("La colección contiene Teléfono con cantidad: " + dispositivos.get("Teléfono"));
        } else {
            System.out.println("Teléfono no está en la colección.");
        }


        System.out.println("Elementos en la colección con sus cantidades:");
        for (Map.Entry<String, Integer> entry : dispositivos.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        dispositivos.clear();
        System.out.println("Después de vaciar la colección: " + dispositivos);
    }
}

