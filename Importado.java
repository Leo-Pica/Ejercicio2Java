package com.mycompany.ejercicio2herencia; // Asegúrate de que el paquete sea correcto

public class Importado extends Articulo {
    private int anioImportacion;
    private float impuesto;

    public Importado(int codigo, String nombre, float precioCosto, int anioImportacion, float impuesto) {
        super(codigo, nombre, precioCosto);
        this.anioImportacion = anioImportacion;
        this.impuesto = impuesto;
    }

    public int getAnioImportacion() {
        return anioImportacion;
    }

    public float getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(float impuesto) {
        this.impuesto = impuesto;
    }

    @Override
    public float precioVenta() {
        float precioInicial = super.precioVenta();
        if (anioImportacion <= 2008) {
            return precioInicial + (impuesto * 0.80f);
        } else {
            return precioInicial + impuesto;
        }
    }

    @Override
    public String tipoArticulo() {
        return "Importado";
    }
}