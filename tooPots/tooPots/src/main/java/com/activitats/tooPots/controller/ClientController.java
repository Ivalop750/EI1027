package com.activitats.tooPots.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.activitats.tooPots.dao.ClientDao;
import com.activitats.tooPots.model.Client;

@Controller
@RequestMapping("/client")
public class ClientController {
	@Autowired
	private ClientDao clientDao;

	@GetMapping("/list")
	public String listClient(Model model) {
		model.addAttribute("clients", clientDao.getClients());
		return "clients/list";
	}
	@GetMapping(value="/list/{clientId}")
	public String getClient(Model model, @PathVariable String clientId) {
		model.addAttribute("clients", clientDao.getClient(clientId));
		return "clients/list";
	}
	@GetMapping(value = "/add")
	public String addClient(Model model) {
		model.addAttribute("client", new Client());
		return "client/add";
	}
	@PostMapping(value = "/add")
	public String addClient(@ModelAttribute("client") Client client, BindingResult bindingResult) {

		if (bindingResult.hasErrors())
			return "client/add";
		clientDao.addClient(client);
		return "redirect:..list";
	}
	@GetMapping(value="/update/{clientId}")
	public String update(Model model, @PathVariable String clientId) {
			model.addAttribute("client", clientDao.getClient(clientId));
		return "client/update"; 
	}
	@PostMapping(value="/update/{clientId}")
	public String update(@PathVariable String clientId,
						 @ModelAttribute("client") Client client,
						 BindingResult bindingResult) {
		if (bindingResult.hasErrors())
			return "client/update";
		 clientDao.updateClient(client);
		 return "redirect:../list"; 
	  }
	@PostMapping(value = "/delete/{clientId}")
	public String delete(@PathVariable String clientId) {
		clientDao.deleteClient(clientId);
		return "redirect:../list";
	}
}
