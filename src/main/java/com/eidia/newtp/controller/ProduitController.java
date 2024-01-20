package com.eidia.newtp.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Page;
import com.eidia.newtp.dao.ProduitRepository;
import com.eidia.newtp.Entities.Produit;

@Controller
public class ProduitController {
	
	@Autowired
	private ProduitRepository produitRepository;
	//@GetMapping({"/","home",})
	@RequestMapping(value="/")
	public String index(Model model, @RequestParam(name="key",defaultValue="")String key) {
		List<Produit> produits;
        produits = produitRepository.findAll();
		System.out.println("list of product"+produits);
        model.addAttribute("listProducts",produits);
		return "products";
	}
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String delete(Long id) {
		produitRepository.deleteById(id);
		return "redirect:/";
	}
	
	@RequestMapping(value="/form", method=RequestMethod.GET)
	public String formProduit(Model model) {
		model.addAttribute("produit",new Produit());
		return "formProduit";
	}
	
	@RequestMapping(value="/edit", method=RequestMethod.GET)
	public String edit(Model model,Long id) {
		Produit product = produitRepository.getOne(id);
		model.addAttribute("produit",product);
		return "editProduit";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String edit(Model model, Produit produit) {
		model.addAttribute("produit",new Produit());
		produitRepository.save(produit);
		return "redirect:/";
	}

	
}
