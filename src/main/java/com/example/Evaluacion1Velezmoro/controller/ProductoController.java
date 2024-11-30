package com.example.Evaluacion1Velezmoro.controller;

import com.example.Evaluacion1Velezmoro.model.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ProductoController {

    // Ruta para mostrar el formulario
    @GetMapping("/formulario_producto")
    public String mostrarFormulario(Model model) {
        model.addAttribute("producto", new Producto());  // Añadimos un objeto Producto vacío al modelo
        return "formulario_producto";  // Página de formulario
    }

    // Ruta para manejar la solicitud POST del formulario
    @PostMapping("/registrar_producto")
    public String registrarProducto(@ModelAttribute Producto producto, Model model) {
        // Aquí el objeto producto ya tiene los valores que el usuario ingresó en el formulario
        model.addAttribute("producto", producto);
        return "exito_producto";  // Página de éxito
    }
}
