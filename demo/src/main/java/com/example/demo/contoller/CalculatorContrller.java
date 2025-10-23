package com.example.demo.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.example.demo.model.Calculator;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculatorContrller {

    int resultSuma = 0;
    int resultResta = 0;
    int resultMult = 0;
    double resultDiv = 0;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("number", new Calculator());
        model.addAttribute("resultSuma", resultSuma);
        model.addAttribute("resultResta", resultResta);
        model.addAttribute("resultMult", resultMult); // le asignamos un nombre clave ""(Es el nombre q se va a usar en el html)  a  la variable
        model.addAttribute("resultDiv", resultDiv);
        return "index";
    }

    @PostMapping("/calculadora")
    public String agrega(@Valid@ModelAttribute Calculator calculator) {

        resultSuma = calculator.getCamp1() + calculator.getCamp2();
        resultResta = calculator.getCamp1() - calculator.getCamp2();
        resultMult = calculator.getCamp1() * calculator.getCamp2();
       
        if (calculator.getCamp2() != 0) {
            resultDiv = calculator.getCamp1() / calculator.getCamp2();
        } else {
            resultDiv = 0;
        }
        return "redirect:/";
    }

}
