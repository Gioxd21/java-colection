import java.util.ArrayList;
import java.util.Collection;

public class Main {  // <- Aquí debe abrir la clase con '{'
    public static void main(String[] args) {  // <- Aquí debe abrir el método con '{'
        // 1. Declaración de una colección de tipo String usando ArrayList
        Collection<String> frutas = new ArrayList<>();

        // 2. Agregar elementos a la colección
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        frutas.add("Uva");

        // Mostrar la colección después de agregar elementos
        System.out.println("Frutas en la colección: " + frutas);

        // 3. Verificar el tamaño de la colección
        System.out.println("Número de elementos en la colección: " + frutas.size());

        // 4. Eliminar un elemento
        frutas.remove("Banana");
        System.out.println("Después de eliminar Banana: " + frutas);

        // 5. Verificar si un elemento existe en la colección
        if (frutas.contains("Manzana")) {
            System.out.println("La colección contiene Manzana.");
        } else {
            System.out.println("Manzana no está en la colección.");
        }

        // 6. Recorrer la colección usando un bucle for-each
        System.out.println("Elementos en la colección:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        // 7. Vaciar la colección
        frutas.clear();
        System.out.println("Después de vaciar la colección: " + frutas);
    }  // <- Aquí debe cerrar el método main
}  // <- Aquí debe cerrar la clase
