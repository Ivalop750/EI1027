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
	private ClientDao clientDao;
	

	@Autowired
	public void setClientDao(ClientDao clientDao) {
		this.clientDao = clientDao;
	}
	@RequestMapping("/list")
	public String listClient(Model model) {
		model.addAttribute("clients", clientDao.getClients());
		return "clients/list";
	}
	@RequestMapping(value="/list/{idClient}", method = RequestMethod.GET)
	public String list1Client(Model model, @PathVariable String idClient) {
		model.addAttribute("client", clientDao.getClient(idClient));
		return "clients/list";
	}
	@RequestMapping(value = "/add")
	public String addClient(Model model) {
		model.addAttribute("client", new Client());
		return "client/add";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processAddSubmit(@ModelAttribute("client") Client client, BindingResult bindingResult) {

		if (bindingResult.hasErrors())
			return "client/add";
		clientDao.addClient(client);
		return "redirect:..list";
	}
	@RequestMapping(value="/update/{idClient}", method = RequestMethod.GET)
	public String editClient(Model model, @PathVariable String idClient) {
			model.addAttribute("client", clientDao.getClient(idClient));
		return "client/update"; 
	}
	@RequestMapping(value="/update/{idClient}", method = RequestMethod.POST) 
	public String processUpdateSubmit(@PathVariable String idClient, 
                            @ModelAttribute("client") Client client, 
                            BindingResult bindingResult) {
		if (bindingResult.hasErrors())
			return "client/update";
		 clientDao.updateClient(client);
		 return "redirect:../list"; 
	  }
	@RequestMapping(value = "/delete/{idClient}")
	public String processDelete(@PathVariable String idClient) {
		clientDao.deleteClient(idClient);
		return "redirect:../list";
	}
}
