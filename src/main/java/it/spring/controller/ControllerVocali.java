package it.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.spring.core.ControlloFrase;

@Controller
public class ControllerVocali {

	@RequestMapping(value = "/controlloVocali")
	public ModelAndView checkVocali(@RequestParam("testo") String testo, Model model) {
		
		ControlloFrase frase = new ControlloFrase();
		ModelAndView nextJsp = new ModelAndView();
		nextJsp.setViewName("risultato");
		nextJsp.addObject("vocali", frase.conteggioVocali(testo));
		return nextJsp;
	}
}
