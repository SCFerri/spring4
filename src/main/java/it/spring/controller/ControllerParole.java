package it.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.spring.core.ControlloFrase;

@Controller
public class ControllerParole {

	@RequestMapping(value = "/controlloParole")
	public ModelAndView checkParole(@RequestParam("testo") String testo, Model model) {
		
		ControlloFrase frase = new ControlloFrase();
		ModelAndView nextJsp = new ModelAndView();
		nextJsp.setViewName("risultato");
		nextJsp.addObject("parole", frase.conteggioParole(testo));
		return nextJsp;
	}
}
