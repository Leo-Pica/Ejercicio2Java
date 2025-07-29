package com.mycompany.ejercicio2herencia; // Varificar que el paquete sea correcto

public class Prueba {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA DE ARTÍCULOS ---");

        // 1. Crear un Artículo genérico
        System.out.println("\n--- Artículo Genérico ---");
        Articulo articuloGenerico = new Articulo(1, "Libro de Java", 100.0f);
        System.out.println("Código: " + articuloGenerico.getCodigo());
        System.out.println("Nombre: " + articuloGenerico.getNombre());
        System.out.println("Precio Costo: $" + articuloGenerico.getPrecioCosto());
        System.out.println("Tipo: " + articuloGenerico.tipoArticulo());
        System.out.println("Precio Venta: $" + String.format("%.2f", articuloGenerico.precioVenta()));

        // 2. Crear Artículos Nacionales
        System.out.println("\n--- Artículos Nacionales ---");

        Nacional nacionalSubsidiado = new Nacional(101, "Leche Entera", 50.0f, "Montevideo", true);
        System.out.println("\nArtículo Nacional Subsidiado (Montevideo):");
        System.out.println("Código: " + nacionalSubsidiado.getCodigo());
        System.out.println("Nombre: " + nacionalSubsidiado.getNombre());
        System.out.println("Precio Costo: $" + nacionalSubsidiado.getPrecioCosto());
        System.out.println("Departamento: " + nacionalSubsidiado.getDepartamento());
        System.out.println("Subsidiado: " + nacionalSubsidiado.getSubsidiado());
        System.out.println("Tipo: " + nacionalSubsidiado.tipoArticulo());
        System.out.println("Precio Venta: $" + String.format("%.2f", nacionalSubsidiado.precioVenta()));

        Nacional nacionalNoSubsInterior = new Nacional(102, "Carne Vacuna", 300.0f, "Paysandú", false);
        System.out.println("\nArtículo Nacional No Subsidiado (Interior - Paysandú):");
        System.out.println("Código: " + nacionalNoSubsInterior.getCodigo());
        System.out.println("Nombre: " + nacionalNoSubsInterior.getNombre());
        System.out.println("Precio Costo: $" + nacionalNoSubsInterior.getPrecioCosto());
        System.out.println("Departamento: " + nacionalNoSubsInterior.getDepartamento());
        System.out.println("Subsidiado: " + nacionalNoSubsInterior.getSubsidiado());
        System.out.println("Tipo: " + nacionalNoSubsInterior.tipoArticulo());
        System.out.println("Precio Venta: $" + String.format("%.2f", nacionalNoSubsInterior.precioVenta()));

        Nacional nacionalNoSubsMontevideo = new Nacional(103, "Pan Casero", 80.0f, "Montevideo", false);
        System.out.println("\nArtículo Nacional No Subsidiado (Montevideo):");
        System.out.println("Código: " + nacionalNoSubsMontevideo.getCodigo());
        System.out.println("Nombre: " + nacionalNoSubsMontevideo.getNombre());
        System.out.println("Precio Costo: $" + nacionalNoSubsMontevideo.getPrecioCosto());
        System.out.println("Departamento: " + nacionalNoSubsMontevideo.getDepartamento());
        System.out.println("Subsidiado: " + nacionalNoSubsMontevideo.getSubsidiado());
        System.out.println("Tipo: " + nacionalNoSubsMontevideo.tipoArticulo());
        System.out.println("Precio Venta: $" + String.format("%.2f", nacionalNoSubsMontevideo.precioVenta()));

        // 3. Crear Artículos Importados
        System.out.println("\n--- Artículos Importados ---");

        Importado importadoViejo = new Importado(201, "Smartphone", 500.0f, 2007, 100.0f);
        System.out.println("\nArtículo Importado (Año <= 2008):");
        System.out.println("Código: " + importadoViejo.getCodigo());
        System.out.println("Nombre: " + importadoViejo.getNombre());
        System.out.println("Precio Costo: $" + importadoViejo.getPrecioCosto());
        System.out.println("Año Importación: " + importadoViejo.getAnioImportacion());
        System.out.println("Impuesto: $" + importadoViejo.getImpuesto());
        System.out.println("Tipo: " + importadoViejo.tipoArticulo());
        System.out.println("Precio Venta: $" + String.format("%.2f", importadoViejo.precioVenta()));

        Importado importadoNuevo = new Importado(202, "Auriculares Bluetooth", 150.0f, 2020, 30.0f);
        System.out.println("\nArtículo Importado (Año > 2008):");
        System.out.println("Código: " + importadoNuevo.getCodigo());
        System.out.println("Nombre: " + importadoNuevo.getNombre());
        System.out.println("Precio Costo: $" + importadoNuevo.getPrecioCosto());
        System.out.println("Año Importación: " + importadoNuevo.getAnioImportacion());
        System.out.println("Impuesto: $" + importadoNuevo.getImpuesto());
        System.out.println("Tipo: " + importadoNuevo.tipoArticulo());
        System.out.println("Precio Venta: $" + String.format("%.2f", importadoNuevo.precioVenta()));
    }
}
