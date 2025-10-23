package com.example.demo.exeption;

import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(MethodArgumentNotValidException.class)

    public String MethodArgumentNotValidException(MethodArgumentNotValidException ex, Model model) {
        List<String> mensajes = ex.getBindingResult().getAllErrors()
                .stream() // Convierte la lista en un Stream es como una cinta transportadora
                .map(error -> error.getDefaultMessage()) // Transforma cada error en su mensaje de texto
                .collect(Collectors.toList()); //Recolecta todos los mensajes en una nueva lista
        model.addAttribute("erroresValidacion", mensajes); // Añade la lista de mensajes al modelo para mostrarlos en la vista
        return "index";
    }

    @ExceptionHandler(Exception.class)
    public String errorInesperado(Exception ex, Model model) {
        model.addAttribute("error", "Ocurrió un error inesperado");
        logger.error("Error inesperado ", ex);
        return "index";
    }

}
