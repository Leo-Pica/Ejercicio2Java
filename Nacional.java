package com.mycompany.ejercicio2herencia; // Hay que verificar que el paquete sea correcto

public class Nacional extends Articulo {
    private String departamento;
    private boolean subsidiado;

    public Nacional(int codigo, String nombre, float precioCosto, String departamento, boolean subsidiado) {
        super(codigo, nombre, precioCosto);
        this.departamento = departamento;
        this.subsidiado = subsidiado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public boolean getSubsidiado() {
        return subsidiado;
    }

    public void setSubsidiado(boolean subsidiado) {
        this.subsidiado = subsidiado;
    }

    @Override
    public float precioVenta() {
        float precioInicial = super.precioVenta();
        if (subsidiado) {
            return precioInicial;
        } else {
            if (departamento.equalsIgnoreCase("Montevideo")) {
                return precioInicial * 1.15f;
            } else {
                return precioInicial * 1.10f;
            }
        }
    }

    @Override
    public String tipoArticulo() {
        return "Nacional";
    }
}
