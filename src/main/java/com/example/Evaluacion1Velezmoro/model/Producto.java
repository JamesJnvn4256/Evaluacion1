package com.example.Evaluacion1Velezmoro.model;

public class Producto {

    private String nombre;

    // Ahora 'fechaCaducidad' es un String
    private String fechaCaducidad;

    // Cambiados a String
    private String stockMinimo;
    private String stockMaximo;
    private String precioUnitario;
    private String categoria;
    private String marca;

    // Constructor vacío (necesario para Spring y Thymeleaf)
    public Producto() {}

    // Constructor con parámetros
    public Producto(String nombre, String fechaCaducidad, String stockMinimo, String stockMaximo,
                    String precioUnitario, String categoria, String marca) {
        this.nombre = nombre;
        this.fechaCaducidad = fechaCaducidad;
        this.stockMinimo = stockMinimo;
        this.stockMaximo = stockMaximo;
        this.precioUnitario = precioUnitario;
        this.categoria = categoria;
        this.marca = marca;
    }

    // Métodos Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(String stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public String getStockMaximo() {
        return stockMaximo;
    }

    public void setStockMaximo(String stockMaximo) {
        this.stockMaximo = stockMaximo;
    }

    public String getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(String precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
